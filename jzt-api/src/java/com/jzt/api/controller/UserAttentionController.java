package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.UserAttentionPlatform;
import com.jzt.api.domain.UserAttentionPlatformExample;
import com.jzt.api.domain.UserAttentionProduct;
import com.jzt.api.domain.UserAttentionProductExample;
import com.jzt.api.service.UserAttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *user:lsl
 *date:2017年3月17日
 */

@Controller
@RequestMapping("/rest/{version}/attention")
public class UserAttentionController extends BaseController{

	@Autowired
	private UserAttentionService userAttentionService;
	
	//添加用户关注平台
	@RequestMapping(value = "/platform/{uid}/{pid}")
    @ResponseBody
    public Map<String, Object> attenPlat(@PathVariable(value = "uid") Integer uid, @PathVariable(value = "pid") Integer pid){
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			UserAttentionPlatform record = new UserAttentionPlatform();
			record.setPid(pid);
			record.setUid(uid);
			List<UserAttentionPlatform> records = userAttentionService.findUserPlatform(record);
			if(records != null && records.size() > 0){
				result.put("res", "1");
				result.put("message", "the record already exists");
				
			}
			else{
				result = userAttentionService.saveAttenPlat(record);
			}
			
			
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
	
	//添加用户关注产品
	@RequestMapping(value = "/product/{type}/{uid}/{prod_id}")
    @ResponseBody
    public Map<String, Object> attenProduct(@PathVariable(value = "type")Integer type, @PathVariable(value = "uid")Integer uid, @PathVariable(value = "prod_id")Integer prod_id){
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			UserAttentionProduct record = new UserAttentionProduct();
			record.setPid(prod_id);
			record.setUid(uid);
			record.setType(type);
			List<UserAttentionProduct> records = userAttentionService.findUserProduct(record);
			if(records != null && records.size() > 0){
				result.put("res", "1");
				result.put("message", "the record already exists");
			}
			else{
				result = userAttentionService.saveAttenPro(record);
			}
			
			
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
	
	//银行平台关注列表
	@RequestMapping(value = "/platform/bank/list/{uid}/{startRow}/{pageSize}")
	@ResponseBody
	public Map<String, Object> bankList(@PathVariable(value = "uid")Integer uid, @PathVariable(value = "startRow")Integer startRow, @PathVariable(value = "pageSize")Integer pageSize){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			result = userAttentionService.findPlatformByUser(uid, 1, startRow * pageSize, pageSize);
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		return result;
	}
	
	//p2p平台列表
	@RequestMapping(value = "/platform/p2p/list/{uid}/{startRow}/{pageSize}")
	@ResponseBody
	public Map<String, Object> p2pList(@PathVariable(value = "uid")Integer uid, @PathVariable(value = "startRow")Integer startRow, @PathVariable(value = "pageSize")Integer pageSize){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			result = userAttentionService.findPlatformByUserP2p(uid, 0, startRow * pageSize , pageSize);
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		return result;
	}
	
	//p2p标的列表
	@RequestMapping(value = "/product/p2p/list/{uid}/{startRow}/{pageSize}")
	@ResponseBody
	public Map<String, Object> p2pLoanList(@PathVariable(value = "uid")Integer uid, @PathVariable(value = "startRow")Integer startRow, @PathVariable(value = "pageSize")Integer pageSize){
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			result = userAttentionService.findP2pLoanByUser(uid, startRow * pageSize, pageSize);
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
	
	//银行标的列表
	@RequestMapping(value = "/product/bank/list/{uid}/{startRow}/{pageSize}")
	@ResponseBody
	public Map<String, Object> bankLoanList(@PathVariable(value = "uid")Integer uid, @PathVariable(value = "startRow")Integer startRow, @PathVariable(value = "pageSize")Integer pageSize){
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			result = userAttentionService.findBankLoanByUser(uid, startRow * pageSize, pageSize);
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
	
	//取消关注平台
	@RequestMapping(value = "/platform/cancel/{uid}/{pid}")
	@ResponseBody
	public Map<String, Object> cancelAttentionToPlat(@PathVariable(value = "uid")Integer uid, @PathVariable(value = "pid")Integer pid){
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			UserAttentionPlatformExample example = new UserAttentionPlatformExample();
			example.createCriteria().andUidEqualTo(uid);
			example.or().andPidEqualTo(pid);
			result = userAttentionService.deleteAttenPlat(example);
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
	
	//取消关注产品
	@RequestMapping(value = "/product/cancel/{type}/{uid}/{prod_id}")
	@ResponseBody
	public Map<String, Object> cancelAttentionToPro(@PathVariable(value = "type")Integer type, @PathVariable(value = "uid")Integer uid, @PathVariable(value = "prod_id")Integer prod_id){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			UserAttentionProductExample example = new UserAttentionProductExample();
			example.createCriteria().andTypeEqualTo(type);
			example.or().andUidEqualTo(uid);
			example.or().andPidEqualTo(prod_id);
			result = userAttentionService.deleteAttenPro(example);
			
		}catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }
		
		return result;
	}
	
}
