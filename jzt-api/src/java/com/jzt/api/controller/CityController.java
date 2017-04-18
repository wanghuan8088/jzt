package com.jzt.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jzt.api.dao.CityMapper;
import com.jzt.api.domain.CityExample;
import net.sf.json.JSONObject;

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

	@Autowired
	CityMapper cityMapper;
	
	
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
	
	
	/**  
	* 用途：后台管理指定城市详情
	* 作者：廖凯红
	* 时间：20170413
	*/
	@RequestMapping(value="/cityDetail/{id}")
	@ResponseBody
	public Map<String, Object> cityDetail(@PathVariable(value="id") int id)
	{
		Map<String, Object> result = new HashMap<>();
		
		try 
        {
        	City city= cityService.selectById(id);

            Map<String, Object> data = new HashMap<String, Object>();
            data.put("city", city);
            
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
	* 用途：后台管理新增或者修改城市
	* 作者：廖凯红
	* 时间：20170413
	*/
	@RequestMapping(value="/saveOrUpdate")
	@ResponseBody
	public Map<String, Object> saveOrUpdate(@PathVariable(value="para")String para)
	{
		Map<String, Object> result = new HashMap<>();
		
		JSONObject jsStr = JSONObject.fromObject(para);
		City record = (City) JSONObject.toBean(jsStr, City.class);
		
		try 
        {
        	cityService.saveOrUpdate(record);

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

	/**
	 * 用途：返回指定省份的城市
	 * 时间：20170418
	 */
	@RequestMapping(value="/{province}")
	@ResponseBody
	public Map<String, Object> cityOfProvince(@PathVariable(value="province")int province)
	{
		Map<String, Object> result = new HashMap<String, Object>();

		try {
			Map<String, Object> data = new HashMap<String, Object>();
			CityExample example = new CityExample();
			CityExample.Criteria criteria = example.createCriteria();
			criteria.andProvinceEqualTo(province);
			List<City> list = cityMapper.selectByExample(example);
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
	
	

}
