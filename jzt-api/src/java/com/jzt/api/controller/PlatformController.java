package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.Businessman;
import com.jzt.api.domain.News;
import com.jzt.api.domain.Platform;
import com.jzt.api.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
