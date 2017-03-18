package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.Platform;
import com.jzt.api.domain.ProblemPlat;
import com.jzt.api.service.ProblemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 问题平台
 */


@Controller
@RequestMapping("/rest/{version}/problem")
public class ProblemController extends BaseController {


    @Autowired
    private ProblemService problemService;


//    @RequestMapping(value = "/list/{date}")
//    @ResponseBody
//    public Map<String, Object> list(@PathVariable String date){
//
//        Map<String, Object> result = new HashMap<String, Object>();
//
//        try {
//            Map<String, Object> data = new HashMap<String, Object>();
//            Platform platform = new Platform();
//            List<Platform> list = problemService.list(platform);
//
//            data.put("report", list);
//            result.put("data", data );
//            result.put("res", "0");
//            result.put("message", "Success");
//        } catch (Exception e) {
//            result.put("res", "1");
//            result.put("message", "Error-"+e.getMessage());
//        }
//
//        return result;
//    }
    
    /**
     * liaokaihong 20170318
     */
    @RequestMapping(value="/list/{type}")
    @ResponseBody
    public Map<String, Object> list(@PathVariable String type)
    {
    	Map<String,Object> result = new HashMap<String,Object>();
    	
		try 
		{
			int type_value = Integer.parseInt(type);
			List<ProblemPlat> list = problemService.selectProblemPlatByType(type_value);
	
			
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("platform", list);
			
			
			result.put("data", data );
			result.put("res", "0");
			result.put("message", "Success");
		  
		} 
		catch (Exception e) 
		{
		    result.put("res", "1");
		    result.put("message", "Error-"+e.getMessage());
		}
    	
    	
    	
    	return result;
    }
    
    
    
    

}
