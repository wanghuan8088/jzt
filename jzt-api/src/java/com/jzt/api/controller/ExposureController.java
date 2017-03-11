package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.Exposure;
import com.jzt.api.service.ExposureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 曝光平台
 */

@Controller
@RequestMapping("/rest/{version}/exposure")
public class ExposureController extends BaseController {

    @Autowired
    private ExposureService exposureService;

    @RequestMapping(value = "/list/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> list(@PathVariable(value="startRow") int startRow,
                                    @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Exposure exposure = new Exposure();
            exposure.setStartRow(startRow);
            exposure.setPageSize(pageSize);
            List<Exposure> list = exposureService.list(exposure);

            data.put("exposure", list);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }

    @RequestMapping(value = "/list/{id}/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> listByPlatform(@PathVariable(value="id") int id,
                                              @PathVariable(value="startRow") int startRow,
                                              @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Exposure exposure = new Exposure();
            exposure.setStartRow(startRow);
            exposure.setPageSize(pageSize);
            exposure.setPlatId(id);
            List<Exposure> list = exposureService.listByPlatform(exposure);

            data.put("exposure", list);
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
