package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.*;
import com.jzt.api.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * P2p平台接口
 * jzt-web后台 增删改查
 */

@Controller
@RequestMapping("/rest/{version}/p2pplat")
public class P2pPlatController extends BaseController {

    @Autowired
    private P2pPlatService p2pPlatService;

    @Autowired
    private PlatformService platformService;

/*    @Autowired
    private P2pSecurityService p2pSecurityService;

    @Autowired
    private PlatAppService platAppService;

    @Autowired
    private PlatContactService platContactService;

    @Autowired
    private  PlatRelTagService platRelTagService;

    @Autowired
    private  PlatWebService platWebService;

    @Autowired
    private  CompanyService companyService;

    @Autowired
    private  CompanyStructureService companyStructureService;

    @Autowired
    private  BusinessmanService businessmanService ;

    @Autowired
    private  StockholderService stockholderService ;

    @Autowired
    private  SafeRelWebService safeRelWebService ;

    @Autowired
    private  PartnerRelCompanyService partnerRelCompanyService ;*/
    /***
     * p2p平台列表
     * @param startRow   起始页码
     * @param pageSize   显示多少结果
     * @return
     */
    @RequestMapping(value = "/list/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> list(@PathVariable(value = "startRow") int startRow,
                                    @PathVariable(value = "pageSize") int pageSize) {

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            P2pPlat p2pPlat = new P2pPlat();
            p2pPlat.setStartRow(startRow);
            p2pPlat.setPageSize(pageSize);
            List<Map> record = p2pPlatService.list(p2pPlat);

            data.put("p2pplat", record);
            result.put("data", data);
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-" + e.getMessage());
        }

        return result;
    }

    /***
     * 删除p2p平台
     * @param nid   p2p平台id
     * @return
     */
    @RequestMapping(value = "/delete/{nid}")
    @ResponseBody
    public Map<String, Object> delete(@PathVariable(value = "nid") int nid) {

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            P2pPlat p2pPlat = new P2pPlat();
            p2pPlat.setId(nid);
            p2pPlatService.delete(p2pPlat);

            result.put("data", data);
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-" + e.getMessage());
        }

        return result;
    }


}
