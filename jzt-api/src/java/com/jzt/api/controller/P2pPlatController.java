package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.P2pPlat;
import com.jzt.api.service.P2pPlatService;
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

    /***
     * p2p平台具体信息编辑
     * @param id :  p2p平台id
     * @return
     */
    @RequestMapping(value = "/detail/{id}")
    @ResponseBody
    public Map<String, Object> detail(@PathVariable(value = "id") int id) {

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            P2pPlat p2pPlat = new P2pPlat();
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
}
