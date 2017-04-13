package com.jzt.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.Province;
import com.jzt.api.service.ProvinceService;

/**
 * Desc: ProvinceController
 * 
 * @author Kavin
 * @since  2016-Sep-7 
 */
@Controller
@RequestMapping("province")
public class ProvinceController extends BaseController {
	
	@Autowired
	private ProvinceService provinceService;
	
	/**  
	* @Title: save  
	* @Description: save
	* @param @param para
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	@RequestMapping(value = "/save")
	@ResponseBody
	public Map<String, Object> save(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		Province record = (Province) JSONObject.toBean(jsStr, Province.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = provinceService.save(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}
	
	/**  
	* @Title: saveOrUpdate  
	* @Description: saveOrUpdate
	* @param @param para
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	@RequestMapping(value = "/saveOrUpdate")
	@ResponseBody
	public Map<String, Object> saveOrUpdate(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		Province record = (Province) JSONObject.toBean(jsStr, Province.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = provinceService.saveOrUpdate(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}
	
	/**  
	* @Title: delete  
	* @Description: delete 
	* @param @param para
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	@RequestMapping(value = "/delete")
	@ResponseBody
	public Map<String, Object> delete(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		Province record = (Province) JSONObject.toBean(jsStr, Province.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = provinceService.delete(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}
	
	/**  
	* @Title: query  
	* @Description: query 
	* @param @param para
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	@RequestMapping(value = "/query")
	@ResponseBody
	public Map<String, Object> query(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		Province record = (Province) JSONObject.toBean(jsStr, Province.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = provinceService.selectOneByPrimaryKey(record.getId());
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}
	
	
	/**  
	* 用途：后台管理查询省份列表
	* 作者：廖凯红
	* 时间：20170408
	*/
	@RequestMapping(value = "/plist/{startRow}/{pageSize}")
	@ResponseBody
	public Map<String, Object> plist(@PathVariable(value="startRow") int startRow,@PathVariable(value="pageSize") int pageSize)
    {
		Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            
            List<Province> list = provinceService.selectProvinceList(startRow,pageSize);
            data.put("province", list);
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
	* 用途：后台管理删除指定省份
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
        	Province record = new Province();
    		record.setId(id);
    		provinceService.delete(record);

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
