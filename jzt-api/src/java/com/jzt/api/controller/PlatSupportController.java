package com.jzt.api.controller;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.PlatState;
import com.jzt.api.domain.SafeCert;
import com.jzt.api.domain.Tag;
import com.jzt.api.service.PlatSupportService;

/**
 *user:lsl
 *date:2017年4月11日
 */

@Controller
@RequestMapping("/rest/{version}/platSupport")
public class PlatSupportController extends BaseController{

	
	@Autowired
	private PlatSupportService platSupportService;
	
	@RequestMapping(value = "/tagList/{startPage}/{pageSize}")
    @ResponseBody
    public Map<String, Object> tagList(@PathVariable(value = "startPage")Integer startPage, @PathVariable(value = "pageSize")Integer pageSize){
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			Tag tag = new Tag();
			tag.setStartPage(startPage);
			tag.setPageSize(pageSize);
			result = platSupportService.findTagsByPage(tag);
			
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
	
	
	
	@RequestMapping(value = "/stateList/{startPage}/{pageSize}")
    @ResponseBody
    public Map<String, Object> stateList(@PathVariable(value = "startPage")Integer startPage, @PathVariable(value = "pageSize")Integer pageSize){
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			PlatState platState = new PlatState();
			platState.setStartPage(startPage);
			platState.setPageSize(pageSize);
			result = platSupportService.findStatesByPage(platState);
			
			
			
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
	
	@RequestMapping(value = "/safeCertList/{startPage}/{pageSize}")
    @ResponseBody
    public Map<String, Object> safeCertList(@PathVariable(value = "startPage")Integer startPage, @PathVariable(value = "pageSize")Integer pageSize){
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			
			SafeCert safeCert = new SafeCert();
			safeCert.setStartPage(startPage);
			safeCert.setPageSize(pageSize);
			result = platSupportService.findSafeCertsByPage(safeCert);
			
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
	
	@RequestMapping(value = "/deleteTag/{tagId}")
    @ResponseBody
    public Map<String, Object> deleteTag(@PathVariable(value = "tagId")Integer tagId){
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			Tag tag = new Tag();
			tag.setId(tagId);
			result = platSupportService.deleteOneTag(tag);
			
			
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
	
	@RequestMapping(value = "/deleteState/{stateId}")
    @ResponseBody
    public Map<String, Object> deleteState(@PathVariable(value = "stateId")Integer stateId){
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			
			PlatState platState = new PlatState();
			platState.setId(stateId);
			result = platSupportService.deleteOneState(platState);
			
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
	
	@RequestMapping(value = "/deleteSafeCert/{safeCertId}")
    @ResponseBody
    public Map<String, Object> deleteSafeCert(@PathVariable(value = "safeCertId")Integer safeCertId){
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			
			SafeCert safeCert = new SafeCert();
			safeCert.setId(safeCertId);
			result = platSupportService.deleteOneSafeCert(safeCert);
			
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
	
	
	@RequestMapping(value = "/addTag")
	@ResponseBody
	public Map<String, Object> addTag(@RequestParam(value="para", required=true) String para){
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			JSONObject jsStr = JSONObject.fromObject(para);
			Tag tag = (Tag)JSONObject.toBean(jsStr, Tag.class);
			result = platSupportService.saveOneTag(tag);
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		
		return result;
	}
	
	
	@RequestMapping(value = "/addState")
	@ResponseBody
	public Map<String, Object> addState(@RequestParam(value="para", required=true) String para){
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			JSONObject jsStr = JSONObject.fromObject(para);
			PlatState state = (PlatState)JSONObject.toBean(jsStr, PlatState.class);
			result = platSupportService.saveOneState(state);
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
	
	@RequestMapping(value = "/addSafeCert")
	@ResponseBody
	public Map<String, Object> addSafeCert(@RequestParam(value="para", required=true) String para){
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			JSONObject jsStr = JSONObject.fromObject(para);
			SafeCert safeCert = (SafeCert)JSONObject.toBean(jsStr, SafeCert.class);
			result = platSupportService.saveOneSafeCert(safeCert);
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
}
