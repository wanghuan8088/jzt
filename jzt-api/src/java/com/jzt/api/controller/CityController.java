package com.jzt.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.City;
import com.jzt.api.domain.Province;
import com.jzt.api.service.CityService;

@Controller
@RequestMapping(value="/rest/{version}/city")
public class CityController extends BaseController{
	
	@Autowired
	CityService cityService;
	
	
	
	/**  
	* 用途：后台管理查询城市列表
	* 作者：廖凯红
	* 时间：20170408
	*/
	@RequestMapping(value="/list/{startRow}/{pageSize}")
	@ResponseBody
	public Map<String, Object> list(@PathVariable(value="startRow")int startRow,@PathVariable(value="pageSize")int pageSize)
	{
		Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            
            List<City> list = cityService.selectCityList(startRow,pageSize);
            data.put("city", list);
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
	* 用途：后台管理删除制定城市
	* 作者：廖凯红
	* 时间：20170408
	*/
	@RequestMapping(value = "/deleteById/{id}")
	@ResponseBody
	public Map<String, Object> deleteById(@PathVariable(value="id") int id)
	{
		Map<String, Object> result = new HashMap<String, Object>();

        try 
        {
        	cityService.deleteById(id);

            Map<String, Object> data = new HashMap<String, Object>();
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
