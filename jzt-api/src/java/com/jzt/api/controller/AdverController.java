package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.AdverContentNow;
import com.jzt.api.service.AdverService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 广告接口
 * jzt-admin 增删改查
 */
@Controller
@RequestMapping("/rest/{version}/ads")
public class AdverController extends BaseController {

    @Autowired
    private AdverService adverService;

    /**
     * 新增广告
     * @param para
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    @ResponseBody
    public Map<String, Object> add(@RequestParam(value = "para", required = true) String para){
        JSONObject jsonObject = JSONObject.fromObject(para);
        AdverContentNow adverContentNow = (AdverContentNow) JSONObject.toBean(jsonObject, AdverContentNow.class);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            adverService.add(adverContentNow);

            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e){
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }

    /**
     * 删除广告
     * @param aid
     * @return
     */
    @RequestMapping(value = "/delete/{aid}")
    @ResponseBody
    public Map<String, Object> delete(@PathVariable(value="aid") int aid){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            AdverContentNow adverContentNow = new AdverContentNow();
            adverContentNow.setAid(aid);
            adverService.delete(adverContentNow);

            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e){
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }

    @RequestMapping(value = "/detail/{aid}")
    @ResponseBody
    public Map<String, Object> detail(@PathVariable(value = "aid")int aid){
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            AdverContentNow adverContentNow = new AdverContentNow();
            adverContentNow.setAid(aid);
            AdverContentNow record = adverService.detail(adverContentNow);

            data.put("adver", record);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e){
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }


    /**
     * 更新广告
     * @param para
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/edit")
    @ResponseBody
    public Map<String, Object> edit(@RequestParam(value = "para", required = true) String para){
        JSONObject jsonObject = JSONObject.fromObject(para);
        AdverContentNow adverContentNow = (AdverContentNow) JSONObject.toBean(jsonObject, AdverContentNow.class);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            adverService.edit(adverContentNow);

            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e){
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }
}
