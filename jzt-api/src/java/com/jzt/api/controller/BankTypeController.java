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
import com.jzt.api.domain.BankType;
import com.jzt.api.service.BankTypeService;

/**
 * Desc: BankTypeController
 * 
 * @author Kavin
 * @since  2016-Sep-7 
 */
@Controller
@RequestMapping("/rest/{version}/bankType")
public class BankTypeController extends BaseController {
	
	@Autowired
	private BankTypeService bankTypeService;
	
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
		BankType record = (BankType) JSONObject.toBean(jsStr, BankType.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = bankTypeService.save(record);
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
		BankType record = (BankType) JSONObject.toBean(jsStr, BankType.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = bankTypeService.saveOrUpdate(record);
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
		BankType record = (BankType) JSONObject.toBean(jsStr, BankType.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = bankTypeService.delete(record);
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
		BankType record = (BankType) JSONObject.toBean(jsStr, BankType.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = bankTypeService.selectOneByPrimaryKey(record.getId());
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}
	
	@RequestMapping(value = "/queryall")
	@ResponseBody
	public Map<String, Object> queryall(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		BankType record = (BankType) JSONObject.toBean(jsStr, BankType.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = bankTypeService.queryListByPage(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}
	
	

}
