package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.News;
import com.jzt.api.domain.NewsWithBLOBs;
import com.jzt.api.service.NewsService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 新闻接口
 * jzt-web后台 增删改查
 */

@Controller
@RequestMapping("/rest/{version}/news")
public class NewsController extends BaseController {

    @Autowired
    private NewsService newsService;


    /***
     * 新增新闻
     * @param  para
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    @ResponseBody
    public Map<String, Object> add(@RequestParam(value = "para", required = true) String para) {
        JSONObject jsStr = JSONObject.fromObject(para);
        NewsWithBLOBs dto = (NewsWithBLOBs) JSONObject.toBean(jsStr, NewsWithBLOBs.class);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            newsService.add(dto);

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
     * 新闻列表
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
            News news = new News();
            news.setStartRow(startRow);
            news.setPageSize(pageSize);
            List<News> list = newsService.list(news);

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
     * 删除新闻
     * @param nid   新闻id
     * @return
     */
    @RequestMapping(value = "/delete/{nid}")
    @ResponseBody
    public Map<String, Object> delete(@PathVariable(value="nid") int nid){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            News news = new News();
            news.setNid(nid);
            newsService.delete(news);

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
     * 新闻详细
     * @param nid   新闻id
     * @return
     */
    @RequestMapping(value = "/detail/{nid}")
    @ResponseBody
    public Map<String, Object> detail(@PathVariable(value="nid") int nid){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            News news = new News();
            news.setNid(nid);
            News record = newsService.detail(news);

            data.put("news", record);
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