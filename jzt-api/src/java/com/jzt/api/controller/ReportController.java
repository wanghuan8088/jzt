package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.Report;
import com.jzt.api.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanghuan on 10/03/2017.
 */

@Controller
@RequestMapping("/rest/{version}/report")
public class ReportController extends BaseController {

    @Autowired
    private ReportService reportService;


    @RequestMapping(value = "/list/{date}")
    @ResponseBody
    public Map<String, Object> list(@PathVariable String date){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Report report = new Report();
            List<Report> list = reportService.list(report);

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

}
