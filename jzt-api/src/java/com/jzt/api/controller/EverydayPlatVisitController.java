package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.EverydayPlatVisit;
import com.jzt.api.service.EverydayPlatVisitService;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 平台每日访问量接口
 * jzt-web后台 增删改查
 */

@Controller
@RequestMapping("/rest/{version}/everydaypv")
public class EverydayPlatVisitController extends BaseController {

    @Autowired
    private EverydayPlatVisitService everydayplatvisitService;

    /***
     * 新增平台每日访问量
     * @param  para
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    @ResponseBody
    public Map<String, Object> add(@RequestParam(value = "para", required = true) String para) {
        JSONObject jsStr = JSONObject.fromObject(para);
        EverydayPlatVisit dto = (EverydayPlatVisit) JSONObject.toBean(jsStr, EverydayPlatVisit.class);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            everydayplatvisitService.add(dto);

          //  data.put("platform", list);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }

    /***
     * 平台每日访问量列表
     * @param startRow   起始页码
     * @param pageSize   显示多少结果
     * @return
     */
    @RequestMapping(value = "/list/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> list(@PathVariable(value="startRow") int startRow,
                                    @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            EverydayPlatVisit everydayplatvisit = new EverydayPlatVisit();
            everydayplatvisit.setStartRow(startRow);
            everydayplatvisit.setPageSize(pageSize);
            List<EverydayPlatVisit> list = everydayplatvisitService.list(everydayplatvisit);
            data.put("everydayplatvisit", list);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }
    
    /***
     * 修改平台每日访问量
     * @param
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/modify")
    @ResponseBody
    public Map<String, Object> modify(@RequestParam(value = "para", required = true) String para) {
        JSONObject jsStr = JSONObject.fromObject(para);
        EverydayPlatVisit dto = (EverydayPlatVisit) JSONObject.toBean(jsStr, EverydayPlatVisit.class);
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            everydayplatvisitService.update(dto);

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
     * 删除平台每日访问量
     * @param id   平台id
     * @return
     */
    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public Map<String, Object> delete(@PathVariable(value="id") int id){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            EverydayPlatVisit everydayplatvisit = new EverydayPlatVisit();
            everydayplatvisit.setId(id);
            everydayplatvisitService.delete(everydayplatvisit);

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