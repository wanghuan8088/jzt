package com.jzt.api.controller;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzt.api.common.util.QiNiuUtils;
import com.jzt.api.controller.base.BaseController;


/**
 * 功能概要：UserController
 * 
 * @author Kavin
 * @since  2016年8月11日 
 */
@Controller
@RequestMapping("rest/{version}/qiniu")
public class QiniuController extends BaseController {
	
	@RequestMapping(value = "/getUpToken")
	@ResponseBody
	public Map<String, Object> getUpToken(){
		Map<String, Object> result = new HashMap<String, Object>();
		
		JSONObject jsonObj =null;
		String token = null;
		try {
			token = new QiNiuUtils().getUpToken();
			result.put("res", "0");
			result.put("message", "Success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("res", "1");
			result.put("message", "Error-"+e.getMessage());
		}
		
		result.put("data", token );
		
		
		return result;
	}
}
