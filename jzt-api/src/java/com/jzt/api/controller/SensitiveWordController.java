package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.SensitiveWord;
import com.jzt.api.service.SensitiveWordService;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 敏感词接口
 * jzt-web后台 增删查
 */

@Controller
@RequestMapping("/rest/{version}/sensitiveword")
public class SensitiveWordController extends BaseController {

    @Autowired
    private SensitiveWordService sensitivewordService;

    /***
     * 新增敏感词
     * @param  para
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    @ResponseBody
    public Map<String, Object> add(@RequestParam(value = "para", required = true) String para) {
        JSONObject jsStr = JSONObject.fromObject(para);
        SensitiveWord dto = (SensitiveWord) JSONObject.toBean(jsStr, SensitiveWord.class);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            sensitivewordService.add(dto);

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
     * 敏感词列表
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
            SensitiveWord sensitiveword = new SensitiveWord();
            sensitiveword.setStartRow(startRow);
            sensitiveword.setPageSize(pageSize);
            List<SensitiveWord> list = sensitivewordService.list(sensitiveword);

            data.put("sensitiveword", list);
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
     * 删除敏感词
     * @param nid   敏感词id
     * @return
     */
    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public Map<String, Object> delete(@PathVariable(value="id") int id){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            SensitiveWord sensitiveword = new SensitiveWord();
            sensitiveword.setId(id);
            sensitivewordService.delete(sensitiveword);

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