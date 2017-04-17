package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.Administrator;
import com.jzt.api.domain.Exposure;
import com.jzt.api.domain.ExposureImage;
import com.jzt.api.service.ExposureService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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


    @RequestMapping(value = "/{id}")
    @ResponseBody
    public Map<String, Object> detail(@PathVariable(value="id") int id){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Exposure exposure = new Exposure();
            exposure.setEid(id);
            Exposure detail = exposureService.detail(exposure);

            data.put("exposure", detail);
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
     * 我要曝光
     * @param para
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/platform")
    @ResponseBody
    public Map<String, Object> platform(@RequestParam(value="para", required=true) String para){
        JSONObject jsStr = JSONObject.fromObject(para);

        Map<String, Class> classMap = new HashMap<String, Class>();
        classMap.put("exposureImage", ExposureImage.class);
        Exposure dto = (Exposure) JSONObject.toBean(jsStr, Exposure.class, classMap);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            Exposure detail = exposureService.platform(dto);

            data.put("exposure", detail);
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
     * 我的曝光
     * @param id
     * @param startRow
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/user/{id}/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> listByUser(@PathVariable(value="id") int id,
                                              @PathVariable(value="startRow") int startRow,
                                              @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Exposure exposure = new Exposure();
            exposure.setStartRow(startRow);
            exposure.setPageSize(pageSize);
            exposure.setAuthorId(id);
            List<Exposure> list = exposureService.listByUser(exposure);

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
    
    @RequestMapping(value = "/delete/{eid}")
    @ResponseBody
    public Map<String, Object> delete(@PathVariable(value="eid") int eid){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Exposure exposure = new Exposure();
            exposure.setEid(eid);
            exposureService.delete(exposure);

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

        Map<String, Class> classMap = new HashMap<String, Class>();
        classMap.put("exposureImage", ExposureImage.class);
        Exposure dto = (Exposure) JSONObject.toBean(jsStr, Exposure.class, classMap);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            exposureService.update(dto);

            data.put("exposure", dto);
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
