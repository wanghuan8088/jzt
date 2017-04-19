package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.AdverContentNow;
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
    @RequestMapping(value = "/{id}/{uid}")
    @ResponseBody
    public Map<String, Object> detail(@PathVariable(value="id") int id,
                                      @PathVariable(value="uid") int uid){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Platform platform = new Platform();
            platform.setId(id);
            platform.setUserId(uid);
            Map detail = platformService.detailMoreTable(platform);

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

            List list = platformService.compare(pid1, pid2);
            /*if (list.get(2) == 1) {
                data.put("bank", list);
            }
            if (list.get(2) == 0) {
                data.put("p2p", list);
            }
            if (list.get(2) == 2) {
                data.put("info", "银行系和互金系平台不能对比, 请输入其他平台名称");
            }*/
            list.remove(2);
            result.put("data", data);
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }

    /***
     * 平台理财产品信息
     * @param pid   平台id
     * @return
     */
    @RequestMapping(value = "/product/{pid}")
    @ResponseBody
    public Map<String, Object> product(@PathVariable(value="pid") int pid){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            Platform platform = new Platform();
            platform.setId(pid);
            List<Object> list = platformService.product(platform);

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
    public Map<String, Object> newsDetail(@PathVariable(value="id") int id){

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
     * 首页滚动新闻
     * @return
     */
    @RequestMapping(value = "/news/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> newsIndex(@PathVariable(value="startRow") int startRow,
                                    @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Platform platform = new Platform();
            platform.setStartRow(startRow);
            platform.setPageSize(pageSize);
            List<News> list = platformService.newsIndex(platform);

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
     * 首页滚动新闻
     * @return
     */
    @RequestMapping(value = "/ads/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> adsIndex(@PathVariable(value="startRow") int startRow,
                                         @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Platform platform = new Platform();
            platform.setStartRow(startRow);
            platform.setPageSize(pageSize);
            List<AdverContentNow> list = platformService.adsIndex(platform);

            data.put("ads", list);
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


    /***
     * 互金系筛选
     * @param  para
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/filter/p2p/")
    @ResponseBody
    public Map<String, Object> filterP2p(@RequestParam(value = "para", required = true) String para) {
        JSONObject jsStr = JSONObject.fromObject(para);
        Platform dto = (Platform) JSONObject.toBean(jsStr, Platform.class);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            List list = new ArrayList<>();
            Map map = new HashMap();
            map.put("name", "e融宝");
            map.put("icon", "https://bgp.reapal.com/images/login/logo.gif");
            map.put("rate", "30");
            Map map1 = new HashMap();
            map1.put("name", "e融宝2");
            map1.put("icon", "https://bgp.reapal.com/images/login/logo.gif");
            map1.put("rate", "40");

            list.add(map);
            list.add(map1);

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
     * 银行系筛选
     * @param  para
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/filter/bank/")
    @ResponseBody
    public Map<String, Object> filterBank(@RequestParam(value = "para", required = true) String para)
    {
        JSONObject jsStr = JSONObject.fromObject(para);
        Platform dto = (Platform) JSONObject.toBean(jsStr, Platform.class);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            List list = this.platformService.queryBanks(dto);
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
     * 平台简介
     * @param id   平台id
     * @return
     */
    @RequestMapping(value = "/description/{id}")
    @ResponseBody
    public Map<String, Object> description(@PathVariable(value="id") int id){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Platform platform = new Platform();
            platform.setId(id);
            Map description = platformService.description(platform);

            data.put("platform", description);
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
     * 信披报告
     * @param id   平台id
     * @return
     */
    @RequestMapping(value = "/creditDisclosure/{id}")
    @ResponseBody
    public Map<String, Object> creditDisclosure(@PathVariable(value="id") int id){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Platform platform = new Platform();
            platform.setId(id);
            Map creditDisclosure = platformService.creditDisclosure(platform);

            data.put("platform", creditDisclosure);
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
     * p2p平台列表
     * @param
     * @return
     */
    @RequestMapping(value = "/p2pplat/")
    @ResponseBody
    public Map<String, Object> getP2pPlat(){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            List<Map> p2pplat = platformService.listOfP2pPlat();

            data.put("p2pplat", p2pplat);
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
     * 平台的基本信息（不包含关联表查询）
     * @param id :  平台id
     * @return
     */
    @RequestMapping(value = "/detail/{id}")
    @ResponseBody
    public Map<String, Object> basicInfo(@PathVariable(value = "id") int id) {

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            //获取平台基本信息
            Platform platform = new Platform();
            platform.setId(id);
            platform = platformService.detail(platform);

            data.put("platform", platform);
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
     * 平台的基本信息（不包含关联表查询）
     * @param : new record
     * @return
     */
    @RequestMapping(value = "/edit/")
    @ResponseBody
    public Map<String, Object> editBasicInfo(@RequestParam(value = "para", required = true) String para) {
        Map<String, Object> result;
        JSONObject jsStr = JSONObject.fromObject(para);
        Platform dto = (Platform) JSONObject.toBean(jsStr, Platform.class);

        try {
            platformService.update(dto);
            result = generateNomalResult(dto);
        } catch (Exception e) {
            result = generateErrorResult(e);
        }

        return result;
    }
}
