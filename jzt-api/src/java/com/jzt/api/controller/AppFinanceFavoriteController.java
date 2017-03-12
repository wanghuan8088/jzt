package com.jzt.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.AppFinanceFavorite;
import com.jzt.api.domain.AppFinanceFavoriteExample;
import com.jzt.api.service.AppFinanceFavoriteService;

/**
 * Desc: AppFinanceFavoriteController
 * 
 * @author Kavin
 * @since  2016-Sep-7 
 */
@Controller
@RequestMapping("/rest/{version}/appFinanceFavorite")
public class AppFinanceFavoriteController extends BaseController {
	
	@Autowired
	private AppFinanceFavoriteService appFinanceFavoriteService;
	
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
		AppFinanceFavorite record = (AppFinanceFavorite) JSONObject.toBean(jsStr, AppFinanceFavorite.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = appFinanceFavoriteService.save(record);
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
		AppFinanceFavorite record = (AppFinanceFavorite) JSONObject.toBean(jsStr, AppFinanceFavorite.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = appFinanceFavoriteService.saveOrUpdate(record);
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
		AppFinanceFavorite record = (AppFinanceFavorite) JSONObject.toBean(jsStr, AppFinanceFavorite.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = appFinanceFavoriteService.delete(record);
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
		AppFinanceFavorite record = (AppFinanceFavorite) JSONObject.toBean(jsStr, AppFinanceFavorite.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			
			AppFinanceFavoriteExample example = new AppFinanceFavoriteExample();
			example.createCriteria();
			List<AppFinanceFavorite>  appFinanceFavoriteList = appFinanceFavoriteService.selectByExample(example);
			result = generateNomalResult(appFinanceFavoriteList);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}
	
	

}
