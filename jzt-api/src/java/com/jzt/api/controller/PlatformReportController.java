package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.Exposure;
import com.jzt.api.domain.ExposureImage;
import com.jzt.api.domain.Report;
import com.jzt.api.domain.ReportFile;
import com.jzt.api.service.PlatformReportService;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  行业报告
 */

@Controller
@RequestMapping("/rest/{version}/report")
public class PlatformReportController extends BaseController {

    @Autowired
    private PlatformReportService platformReportService;

    /**
     * 列出所有行业报告
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
            Report report = new Report();
            report.setStartRow(startRow);
            report.setPageSize(pageSize);
            report.setType(1);
            List<Report> list = platformReportService.list(report);

            data.put("report", list);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }
    
    @RequestMapping(value = "/listthird/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> listthird(@PathVariable(value="startRow") int startRow,
                                    @PathVariable(value="pageSize") int pageSize){
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Report report = new Report();
            report.setStartRow(startRow);
            report.setPageSize(pageSize);
            report.setType(2);
            List<Report> list = platformReportService.list(report);

            data.put("report", list);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }
    
 



    /**
     * 行业报告明细
     * @param id   报告id
     * @return
     */
    @RequestMapping(value = "/{id}")
    @ResponseBody
    public Map<String, Object> detail(@PathVariable(value="id") int id){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Report report = new Report();
            report.setId(id);
            Report detail = platformReportService.detail(report);
            List<ReportFile> files = platformReportService.listByReport(report);
            data.put("report", detail);
            data.put("filelist", files);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }
    
    
    @RequestMapping(value = "/delete/{rid}")
    @ResponseBody
    public Map<String, Object> delete(@PathVariable(value="rid") int rid){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Report report = new Report();
            report.setId(rid);
            platformReportService.delete(report);

            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }
    @RequestMapping(value = "/deletefile/{id}")
    @ResponseBody
    public Map<String, Object> deletefile(@PathVariable(value="id") int id){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            ReportFile file = new ReportFile();
            file.setId(id);
            platformReportService.deleteReportFile(file);

            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }
    @RequestMapping(method = RequestMethod.POST, value = "/update")
    @ResponseBody
    public Map<String, Object> update(@RequestParam(value="para", required=true) String para){
        JSONObject jsStr = JSONObject.fromObject(para);

  
        Report dto = (Report) JSONObject.toBean(jsStr, Report.class);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            platformReportService.update(dto);

            data.put("report", dto);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    @ResponseBody
    public Map<String, Object> add(@RequestParam(value="para", required=true) String para){
        JSONObject jsStr = JSONObject.fromObject(para);

  
        Report dto = (Report) JSONObject.toBean(jsStr, Report.class);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            platformReportService.add(dto);

            data.put("report", dto);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/addfile")
    @ResponseBody
    public Map<String, Object> addfile(@RequestParam(value="para", required=true) String para){
        JSONObject jsStr = JSONObject.fromObject(para);

  
        ReportFile dto = (ReportFile) JSONObject.toBean(jsStr, ReportFile.class);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            platformReportService.addReportFile(dto);

            data.put("report", dto);
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
