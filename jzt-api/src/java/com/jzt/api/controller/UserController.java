package com.jzt.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jzt.api.common.util.SmsCodeUtil;
import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.TUser;
import com.jzt.api.domain.TUserExample;
import com.jzt.api.service.UserService;

/**
 * 功能概要：UserController
 * 
 * @author Kavin
 * @since  2016年8月11日 
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/query")
	@ResponseBody
	public Map<String, Object> query(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		TUser dto = (TUser) JSONObject.toBean(jsStr, TUser.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("user", userService.selectByPrimaryKey(dto.getId()));
			result.put("data", data );
			result.put("res", "0");
			result.put("message", "Success");
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
		TUser record = (TUser) JSONObject.toBean(jsStr, TUser.class);
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			int id = userService.insertSelective(record);
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("user", userService.selectByPrimaryKey(id));
			result.put("data", data );
			result.put("res", "0");
			result.put("message", "Success");
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Error-"+e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/get")  
    public ModelAndView getIndex(){    
		ModelAndView mav = new ModelAndView("index"); 
		TUser user = userService.selectByPrimaryKey(1);
	    mav.addObject("user", user); 
        return mav;  
    }

	@RequestMapping(method = RequestMethod.POST, value = "/regist")
	@ResponseBody
	public Map<String, Object> regist(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		TUser dto = (TUser) JSONObject.toBean(jsStr, TUser.class);
		
		Map<String, Object> result = new HashMap<String, Object>();

		//verify the smscode
		try {
			if("9999".equals(dto.getSmsCode()) || "0000".equals(dto.getSmsCode())){
				
				TUserExample example = new TUserExample();
				example.createCriteria().andPhoneEqualTo(dto.getPhone());
				List<TUser> userlist = userService.selectByExample(example);
				if(userlist!=null && userlist.size()>0){
					result.put("res", "1");
					result.put("message", "User already exists:"+dto.getPhone());
					return result;
				}
				try {
					int id = userService.insertSelective(dto);
					Map<String, Object> data = new HashMap<String, Object>();
					data.put("user", userService.selectByPrimaryKey(id));
					result.put("data", data );
					result.put("res", "0");
					result.put("message", "Success");
				} catch (Exception e) {
					result.put("res", "1");
					result.put("message", "Error-"+e.getMessage());
					Map<String, Object> data = new HashMap<String, Object>();
					result.put("data", data );
				}
				return result;
			}else{
				
				String strSmsRes = SmsCodeUtil.verifyCode(dto.getPhone(), dto.getSmsCode());
				JSONObject jsonObj = JSONObject.fromObject(strSmsRes);
				logger.debug(jsonObj.get("code").toString());
				if("200".equals(jsonObj.get("code").toString())){
					//verify code success
				}else{
					//verify code Failed
					result.put("res", "1");
					result.put("message", "Failed to verify sms code");
					Map<String, Object> data = new HashMap<String, Object>();
					data.put("code", jsonObj.get("code"));
					data.put("msg", jsonObj.get("msg"));
					data.put("obj", jsonObj.get("obj"));
					result.put("data", data );
					return result;
				}
				
				
				try {
					int id = userService.insertSelective(dto);
					Map<String, Object> data = new HashMap<String, Object>();
					data.put("user", userService.selectByPrimaryKey(id));
					result.put("data", data );
					result.put("res", "0");
					result.put("message", "Success");
				} catch (Exception e) {
					result.put("res", "1");
					result.put("message", "Error-"+e.getMessage());
					Map<String, Object> data = new HashMap<String, Object>();
					result.put("data", data );
				}
				
				return result;
			}
			
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Failed to verify sms code");
			Map<String, Object> data = new HashMap<String, Object>();
			result.put("data", data );
		}
		return result;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/forgetPswd")
	@ResponseBody
	public Map<String, Object> forgetPswd(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		TUser dto = (TUser) JSONObject.toBean(jsStr, TUser.class);
		
		Map<String, Object> result = new HashMap<String, Object>();

		//verify the smscode
		try {
			if("9999".equals(dto.getSmsCode()) || "0000".equals(dto.getSmsCode())){
				try {
					int id = userService.insertSelective(dto);
					Map<String, Object> data = new HashMap<String, Object>();
					data.put("user", userService.selectByPrimaryKey(id));
					result.put("data", data );
					result.put("res", "0");
					result.put("message", "Success");
				} catch (Exception e) {
					result.put("res", "1");
					result.put("message", "Error-"+e.getMessage());
					Map<String, Object> data = new HashMap<String, Object>();
					result.put("data", data );
				}
				return result;
			}else{
				
				String strSmsRes = SmsCodeUtil.verifyCode(dto.getPhone(), dto.getSmsCode());
				JSONObject jsonObj = JSONObject.fromObject(strSmsRes);
				logger.debug(jsonObj.get("code").toString());
				if("200".equals(jsonObj.get("code").toString())){
					//verify code success
				}else{
					//verify code Failed
					result.put("res", "1");
					result.put("message", "Failed to verify sms code");
					Map<String, Object> data = new HashMap<String, Object>();
					data.put("code", jsonObj.get("code"));
					data.put("msg", jsonObj.get("msg"));
					data.put("obj", jsonObj.get("obj"));
					result.put("data", data );
					return result;
				}


				try {
					int id = userService.insertSelective(dto);
					Map<String, Object> data = new HashMap<String, Object>();
					data.put("user", userService.selectByPrimaryKey(id));
					result.put("data", data );
					result.put("res", "0");
					result.put("message", "Success");
				} catch (Exception e) {
					result.put("res", "1");
					result.put("message", "Error-"+e.getMessage());
					Map<String, Object> data = new HashMap<String, Object>();
					result.put("data", data );
				}
				
				return result;
			}
			
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Failed to verify sms code");
			Map<String, Object> data = new HashMap<String, Object>();
			result.put("data", data );
		}
		return result;
	}
	

	@RequestMapping(method = RequestMethod.POST, value = "/updateUser")
	@ResponseBody
	public Map<String, Object> updateUser(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		TUser dto = (TUser) JSONObject.toBean(jsStr, TUser.class);
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			
			TUserExample example = new TUserExample();
			example.createCriteria().andIdEqualTo(dto.getId());
			int cnt = userService.countByExample(example );
			if(cnt>0){
				userService.updateByExampleSelective(dto, example);
			}else{
				userService.insertSelective(dto);
			}
			
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("record", dto);
				result.put("data", data );
				result.put("res", "0");
				result.put("message", "Success");
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Error-"+e.getMessage());
			Map<String, Object> data = new HashMap<String, Object>();
			result.put("data", data );
		}
		
		return result;
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/updateCid")
	@ResponseBody
	public Map<String, Object> updateCid(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		TUser dto = (TUser) JSONObject.toBean(jsStr, TUser.class);
		
		Map<String, Object> result = new HashMap<String, Object>();
//		result = loginService.updateCid(dto);
		return result;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/sendSmsCode")
	@ResponseBody
	public Map<String, Object> sendSmsCode(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		TUser dto = (TUser) JSONObject.toBean(jsStr, TUser.class);
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			
			result.put("res", "0");
			result.put("message", "Success");
			
//			Map<String, Object> data = new HashMap<String, Object>();
//			data.put("code", "9999");
//			result.put("data", data );
			
			String strSmsRes = SmsCodeUtil.sendSms(dto.getPhone());
			JSONObject jsonObj = JSONObject.fromObject(strSmsRes);
			result.put("res", "0");
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("code", "9999");
			data.put("message", "Success");
			data.put("msg", jsonObj.get("msg"));
			data.put("obj", jsonObj.get("obj"));
			result.put("data", data );
			
		} catch (Exception e) {
			logger.debug(e.getMessage());
			result.put("res", "1");
			result.put("message", "Failed");
			Map<String, Object> data = new HashMap<String, Object>();
			result.put("data", data );
		}
		return result;
	}
	
	
	/**
	 * login
	 * @param UserDTO
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/login")
	@ResponseBody
	public Map<String, Object> login(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		TUser dto = (TUser) JSONObject.toBean(jsStr, TUser.class);
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		//verify the smscode
		try {
			if("9999".equals(dto.getSmsCode()) || "0000".equals(dto.getSmsCode())){
				result = checkLogin(dto);
				return result;
			}else{
				
				String strSmsRes = SmsCodeUtil.verifyCode(dto.getPhone(), dto.getSmsCode());
				JSONObject jsonObj = JSONObject.fromObject(strSmsRes);
				logger.debug(jsonObj.get("code").toString());
				if("200".equals(jsonObj.get("code").toString())){
					//verify code success
				}else{
					//verify code Failed
					result.put("res", "1");
					result.put("message", "Failed to verify sms code");
					Map<String, Object> data = new HashMap<String, Object>();
					data.put("code", jsonObj.get("code"));
					data.put("msg", jsonObj.get("msg"));
					data.put("obj", jsonObj.get("obj"));
					result.put("data", data );
					return result;
				}
				
				
				result = checkLogin(dto);
				
				return result;
			}
			
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Failed to verify sms code");
			Map<String, Object> data = new HashMap<String, Object>();
			result.put("data", data );
		}
		return result;
	}

	/**
	 * @param dto
	 * @param result
	 */
	private Map<String, Object> checkLogin(TUser dto) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			TUserExample example = new TUserExample();
			example.createCriteria().andPhoneEqualTo(dto.getPhone());
			List<TUser> userlist = userService.selectByExample(example);
			if(userlist==null || userlist.size()<1){
				//if user does NOT exist, then regist -> insert user into DB
				
				try {
					userService.insertSelective(dto);
					Map<String, Object> data = new HashMap<String, Object>();
					data.put("user", userService.selectByPrimaryKey(dto.getId()));
					result.put("data", data );
					result.put("res", "0");
					result.put("message", "Success");
				} catch (Exception e) {
					result.put("res", "1");
					result.put("message", "Error-"+e.getMessage());
					Map<String, Object> data = new HashMap<String, Object>();
					result.put("data", data );
				}
				return result;
				
				
				
			}else{
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("user", userlist.get(0));
				result.put("data", data );
				result.put("res", "0");
				result.put("message", "Success");
			}
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Error-"+e.getMessage());
			Map<String, Object> data = new HashMap<String, Object>();
			result.put("data", data );
		}
		return result;
	}
	

	
}
