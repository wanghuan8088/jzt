package com.jzt.api.controller;

import com.jzt.api.common.constant.GeneralConstant;
import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.P2pDynamic;
import com.jzt.api.domain.P2pThirdEval;
import com.jzt.api.domain.Platform;
import com.jzt.api.service.RankP2pService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  金融新榜-互金系平台
 */

@Controller
@RequestMapping("/rest/{version}/rank")
public class RankP2pController extends BaseController {

    @Autowired
    private RankP2pService rankP2pService;

    /**
     * 总成交量排行
     * @param type   互金系平台类型
     * @param startRow   起始页码
     * @param pageSize   显示多少结果
     * @return
     */
    @RequestMapping(value = "/p2p/turnover/{type}/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> turnover(@PathVariable(value="type") int type,
                                    @PathVariable(value="startRow") int startRow,
                                    @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            P2pDynamic p2pDynamic = new P2pDynamic();

            p2pDynamic.setTagType(GeneralConstant.P2PTAG.get(type));
            p2pDynamic.setStartRow(startRow);
            p2pDynamic.setPageSize(pageSize);
            List<Map> list = rankP2pService.turnover(p2pDynamic);

            data.put("turnover", list);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }

    /**
     * 人气排行
     * @param type   互金系平台类型
     * @param startRow   起始页码
     * @param pageSize   显示多少结果
     * @return
     */
    @RequestMapping(value = "/p2p/popularity/{type}/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> popularity(@PathVariable(value="type") int type,
                                        @PathVariable(value="startRow") int startRow,
                                        @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            P2pThirdEval p2pThirdEval = new P2pThirdEval();
            p2pThirdEval.setTagType(GeneralConstant.P2PTAG.get(type));
            p2pThirdEval.setStartRow(startRow);
            p2pThirdEval.setPageSize(pageSize);
            List<P2pThirdEval> list = rankP2pService.popularity(p2pThirdEval);

            data.put("report", list);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }

    /**
     * 平均利率排行
     * @param type   互金系平台类型
     * @param startRow   起始页码
     * @param pageSize   显示多少结果
     * @return
     */
    @RequestMapping(value = "/p2p/avgInterestRate/{type}/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> avgInterestRate(@PathVariable(value="type") int type,
                                        @PathVariable(value="startRow") int startRow,
                                        @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            
            //data.put("report", list);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }

    /**
     * 注册资本排行
     * @param type   互金系平台类型
     * @param startRow   起始页码
     * @param pageSize   显示多少结果
     * @return
     */
    @RequestMapping(value = "/p2p/registeredCapital/{type}/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> registeredCapital(@PathVariable(value="type") int type,
                                        @PathVariable(value="startRow") int startRow,
                                        @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            // TODO: 19/03/2017
            Platform platform = new Platform();
            platform.setTagType(GeneralConstant.P2PTAG.get(type));
            platform.setStartRow(startRow);
            platform.setPageSize(pageSize);
            // TODO: 19/03/2017
            List<Platform> list = rankP2pService.registeredCapital(platform);
            data.put("report", list);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }

    /**
     * 运营时间排行
     * @param type   互金系平台类型
     * @param startRow   起始页码
     * @param pageSize   显示多少结果
     * @return
     */
    @RequestMapping(value = "/p2p/serviceTime/{type}/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> serviceTime(@PathVariable(value="type") int type,
                                        @PathVariable(value="startRow") int startRow,
                                        @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            // TODO: 19/03/2017

            //data.put("report", list);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }
}
