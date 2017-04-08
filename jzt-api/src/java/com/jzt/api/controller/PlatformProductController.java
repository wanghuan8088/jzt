package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.service.PlatformProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 理财产品
 */


@Controller
@RequestMapping("/rest/{version}/product")
public class PlatformProductController extends BaseController {

    @Autowired
    private PlatformProductService platformProductService;


    /**
     * p2p理财产品明细
     *
     * @param id 产品id
     * @return
     */
    @RequestMapping(value = "/p2p/{id}")
    @ResponseBody
    public Map<String, Object> p2pDetail(@PathVariable(value = "id") int id) {

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            Map product = new HashMap();
            product = platformProductService.p2pDetail(id);


            data.put("product", product);
            result.put("data", data);
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-" + e.getMessage());
        }

        return result;
    }


    /**
     * 银行理财产品明细
     *
     * @param id 产品id
     * @return
     */
    @RequestMapping(value = "/bank/{id}")
    @ResponseBody
    public Map<String, Object> bankDetail(@PathVariable(value = "id") int id) {

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            Map product = new HashMap();

            product = platformProductService.bankDetail(id);


            data.put("product", product);
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
