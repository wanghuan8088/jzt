package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.Businessman;
import com.jzt.api.domain.News;
import com.jzt.api.domain.Platform;
import com.jzt.api.service.PlatformService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  平台和平台相关信息
 */
@Controller
@RequestMapping("/rest/{version}/platform")
public class PlatformController extends BaseController {

    @Autowired
    private PlatformService platformService;

    /***
     * 平台详细信息
     * @param id   平台id
     * @return
     */
    @RequestMapping(value = "/{id}")
    @ResponseBody
    public Map<String, Object> detail(@PathVariable(value="id") int id){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Platform platform = new Platform();
            platform.setId(id);
            Platform detail = platformService.detail(platform);

            data.put("platform", detail);
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
     * 平台对比
     * @param pid1   平台id
     * @param pid2   平台id
     * @return
     */
    @RequestMapping(value = "/compare/{pid1}/{pid2}")
    @ResponseBody
    public Map<String, Object> compare(@PathVariable(value="pid1") int pid1, @PathVariable(value="pid2") int pid2){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            Platform platform1 = new Platform();
            platform1.setId(pid1);
            Platform detail1 = platformService.detail(platform1);

            Platform platform2 = new Platform();
            platform2.setId(pid2);
            Platform detail2 = platformService.detail(platform2);

            List list = new ArrayList();
            list.add(detail1);
            list.add(detail2);

            data.put("platform", list);
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
     * 平台高管信息
     * @param id   平台id
     * @param startRow   起始页码
     * @param pageSize   显示多少结果
     * @return
     */
    @RequestMapping(value = "/businessman/{id}/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> businessman(@PathVariable(value="id") int id,
                                    @PathVariable(value="startRow") int startRow,
                                    @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Platform platform = new Platform();
            platform.setId(id);
            platform.setStartRow(startRow);
            platform.setPageSize(pageSize);
            List<Businessman> list = platformService.businessman(platform);

            data.put("businessman", list);
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
     * 平台相关新闻
     * @param id   平台id
     * @param startRow   起始页码
     * @param pageSize   显示多少结果
     * @return
     */
    @RequestMapping(value = "/news/{id}/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> news(@PathVariable(value="id") int id,
                                    @PathVariable(value="startRow") int startRow,
                                    @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Platform platform = new Platform();
            platform.setId(id);
            platform.setStartRow(startRow);
            platform.setPageSize(pageSize);
            List<News> list = platformService.news(platform);

            data.put("news", list);
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
     * 新闻详细信息
     * @param id   新闻id
     * @return
     */
    @RequestMapping(value = "/news/detail/{id}")
    @ResponseBody
    public Map<String, Object> news(@PathVariable(value="id") int id){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            News news = new News();
            news.setNid(id);
            News newsResult = platformService.newsDetail(news);

            data.put("news", newsResult);
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
     * 相似名称的平台信息
     * @param  para  平台name
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/likeName")
    @ResponseBody
    public Map<String, Object> likeName(@RequestParam(value = "para", required = true) String para) {
        JSONObject jsStr = JSONObject.fromObject(para);
        Platform dto = (Platform) JSONObject.toBean(jsStr, Platform.class);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            List<Platform> list = platformService.likeName(dto);

            data.put("platform", list);
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
