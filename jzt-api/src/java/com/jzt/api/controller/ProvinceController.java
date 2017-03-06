package com.jzt.api.controller;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	

}
