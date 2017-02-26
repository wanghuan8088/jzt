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
import com.jzt.api.domain.TBizCatelog;
import com.jzt.api.service.TBizCatelogService;

/**
 * 功能概要：UserController
 * 
 * @author Kavin
 * @since  2016年8月11日 
 */
@Controller
@RequestMapping("biz")
public class BizCatelogController extends BaseController {
	
	@Autowired
	private TBizCatelogService tBizCatelogService;
	
	
	
	@RequestMapping(value = "/selecBizCatelogByOwnerId")
	@ResponseBody
	public Map<String, Object> selecBizCatelogByOwnerId(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		TBizCatelog record = (TBizCatelog) JSONObject.toBean(jsStr, TBizCatelog.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = tBizCatelogService.selecBizCatelogByOwnerId(record.getOwnerId());
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Error-"+e.getMessage());
		}
		return result;
	}
	@RequestMapping(value = "/save")
	@ResponseBody
	public Map<String, Object> save(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		TBizCatelog record = (TBizCatelog) JSONObject.toBean(jsStr, TBizCatelog.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = tBizCatelogService.save(record);
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Error-"+e.getMessage());
		}
		return result;
	}
	@RequestMapping(value = "/delete")
	@ResponseBody
	public Map<String, Object> delete(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		TBizCatelog record = (TBizCatelog) JSONObject.toBean(jsStr, TBizCatelog.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = tBizCatelogService.delete(record);
		} catch (Exception e) {
			Map<String, Object> data = new HashMap<String, Object>();
			result.put("data", data );
			result.put("res", "1");
			result.put("message", "Error-"+e.getMessage());
		}
		return result;
	}

}
