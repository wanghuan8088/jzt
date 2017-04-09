package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.*;
import com.jzt.api.service.ProblemService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 问题平台
 */


@Controller
@RequestMapping("/rest/{version}/problem")
public class ProblemController extends BaseController {


    @Autowired
    private ProblemService problemService;


//    @RequestMapping(value = "/list/{date}")
//    @ResponseBody
//    public Map<String, Object> list(@PathVariable String date){
//
//        Map<String, Object> result = new HashMap<String, Object>();
//
//        try {
//            Map<String, Object> data = new HashMap<String, Object>();
//            Platform platform = new Platform();
//            List<Platform> list = problemService.list(platform);
//
//            data.put("report", list);
//            result.put("data", data );
//            result.put("res", "0");
//            result.put("message", "Success");
//        } catch (Exception e) {
//            result.put("res", "1");
//            result.put("message", "Error-"+e.getMessage());
//        }
//
//        return result;
//    }

    /**
     * liaokaihong 20170318
     */
    @RequestMapping(value = "/list/{state}")
    @ResponseBody
    public Map<String, Object> list(@PathVariable String state) {
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            int state_value = Integer.parseInt(state);
            List<ProblemPlat> list = null;

            if (state_value == -1)//对应页面，获取全部问题平台功能
            {
                list = problemService.selectAllProblemPlat();
            } else //对应页面获取特定状态问题平台功能
            {
                list = problemService.selectProblemPlatByState(state_value);
            }


            Map<String, Object> data = new HashMap<String, Object>();
            data.put("platform", list);

            result.put("data", data);
            result.put("res", "0");
            result.put("message", "Success");

        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-" + e.getMessage());
        }


        return result;
    }


    @RequestMapping(value = "/search")
    @ResponseBody
    public Map<String, Object> search(@RequestParam(value = "name") String name) {
        Map<String, Object> result = new HashMap<String, Object>();

        try {

            List<ProblemPlat> list = new ArrayList<ProblemPlat>();

            //判断一下编码方式，处理url中中文参数的编码问题
            if (name.equals(new String(name.getBytes("iso-8859-1"), "iso-8859-1"))) {
                name = new String(name.getBytes("iso-8859-1"), "utf-8");
            }


            if (name != null && !"".equals(name)) {
                list = problemService.selectProblemPlatByName(name);
            }


            Map<String, Object> data = new HashMap<String, Object>();
            data.put("platform", list);

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
     * 搜索问题平台
     * @param para
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/")
    @ResponseBody
    public Map<String, Object> problem(@RequestParam(value = "para", required = true) String para) {
        JSONObject jsStr = JSONObject.fromObject(para);
        Platform dto = (Platform) JSONObject.toBean(jsStr, Platform.class);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            List<ProblemPlat> list = problemService.selectProblemPlat(dto);

            data.put("platform", list);
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
