package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 *  关注平台或产品
 */

@Controller
@RequestMapping("/rest/{version}/attention")
public class AttentionController extends BaseController{


    /***
     * 列出关注的银行平台
     * @param uid  用户ID
     * @param startRow   起始页码
     * @param pageSize   显示多少结果
     * @return
     */
    @RequestMapping(value = "/platform/bank/list/{uid}/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> platformBankList(@PathVariable int uid,
                                            @PathVariable(value="startRow") int startRow,
                                            @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            // TODO

            data.put("bank", null);
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
