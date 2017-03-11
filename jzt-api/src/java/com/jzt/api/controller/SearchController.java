package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.AppKeywordsTrend;
import com.jzt.api.domain.Company;
import com.jzt.api.domain.Platform;
import com.jzt.api.service.KeywordsTrendService;
import com.jzt.api.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  搜索关键字
 */

@Controller
@RequestMapping("/rest/{version}/search")
public class SearchController extends BaseController {


    @Autowired
    private SearchService searchService;

    @Autowired
    private KeywordsTrendService keywordsTrendService;


    @RequestMapping(method = RequestMethod.POST, value = "/")
    @ResponseBody
    public Map<String, Object> search(@RequestParam(value="keyword") String keyword,
                                      @RequestParam(value="platformCount", required=false) String platformCount,
                                      @RequestParam(value="companyCount", required=false) String companyCount){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            if (platformCount !=null && !"".equals(platformCount)) {
                List<Platform> platformList = searchService.platform(keyword);

                int size = 0;
                if (platformList.size() < Integer.valueOf(platformCount)) {
                    size = platformList.size();
                } else {
                    size = Integer.valueOf(platformCount);
                }

                List<Platform> list = new ArrayList();
                for (int i = 0; i < size; i++) {
                    list.add(platformList.get(i));
                }
                data.put("platform", list);
            }

            if (companyCount !=null && !"".equals(companyCount)) {
                List<Company> companyList = searchService.company(keyword);

                int size = 0;
                if (companyList.size() < Integer.valueOf(companyCount)) {
                    size = companyList.size();
                } else {
                    size = Integer.valueOf(companyCount);
                }

                List<Company> list = new ArrayList();
                for (int i = 0; i < size; i++) {
                    list.add(companyList.get(i));
                }
                data.put("company", list);
            }

            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }


    @RequestMapping(value = "/hotkeyword/{count}")
    @ResponseBody
    public Map<String, Object> hotkeyword(@PathVariable int count){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            List<AppKeywordsTrend> list = keywordsTrendService.query(count);

            data.put("keyword", list);
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
