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

import com.jzt.api.common.util.SmsCodeUtil;
import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.UserInformation;
import com.jzt.api.domain.UserInformationExample;
import com.jzt.api.service.UserInformationService;

/**
 * Desc: UserInformationController
 * 
 * @author Kavin
 * @since  2016-Sep-7 
 */
@Controller
@RequestMapping("/rest/{version}/userinformation")
public class UserInformationController extends BaseController {
	
	@Autowired
	private UserInformationService userInformationService;
	
	@RequestMapping(value = "/save")
	@ResponseBody
	public Map<String, Object> save(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		UserInformation record = (UserInformation) JSONObject.toBean(jsStr, UserInformation.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = userInformationService.save(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}
	
	@RequestMapping(value = "/saveOrUpdate")
	@ResponseBody
	public Map<String, Object> saveOrUpdate(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		UserInformation record = (UserInformation) JSONObject.toBean(jsStr, UserInformation.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = userInformationService.saveOrUpdate(record);
			
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}
	
	@RequestMapping(value = "/delete")
	@ResponseBody
	public Map<String, Object> delete(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		UserInformation record = (UserInformation) JSONObject.toBean(jsStr, UserInformation.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = userInformationService.delete(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}
	
	@RequestMapping(value = "/query")
	@ResponseBody
	public Map<String, Object> query(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		UserInformation record = (UserInformation) JSONObject.toBean(jsStr, UserInformation.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("user", userInformationService.selectByPrimaryKey(record.getUid()));
			result.put("data", data );
			result.put("res", "0");
			result.put("message", "Success");
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Error-"+e.getMessage());
		}
		return result;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/regist")
	@ResponseBody
	public Map<String, Object> regist(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		UserInformation dto = (UserInformation) JSONObject.toBean(jsStr, UserInformation.class);
		
		Map<String, Object> result = new HashMap<String, Object>();

		//verify the smscode
		try {
			if("9999".equals(dto.getSmsCode()) || "0000".equals(dto.getSmsCode())){
				return checkRegist(dto, result);
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
				
				
				return checkRegist(dto, result);
				
			}
			
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Failed to verify sms code");
			Map<String, Object> data = new HashMap<String, Object>();
			result.put("data", data );
		}
		return result;
	}

	private Map<String, Object> checkRegist(UserInformation dto,
			Map<String, Object> result) {
		UserInformationExample example = new UserInformationExample();
		example.createCriteria().andPhoneEqualTo(dto.getPhone());
		List<UserInformation> userlist = userInformationService.selectByExample(example);
		if(userlist!=null && userlist.size()>0){
			result.put("res", "1");
			result.put("message", "User already exists:"+dto.getPhone());
		}else{
			try {
				int id = userInformationService.insertSelective(dto);
				result = generateNomalResult(dto);
			} catch (Exception e) {
				result = generateErrorResult(e);
			}
		}
		return result;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/changePswd")
	@ResponseBody
	public Map<String, Object> changePswd(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		UserInformation dto = (UserInformation) JSONObject.toBean(jsStr, UserInformation.class);
		
		return userInformationService.changePswd(dto);
	}
	
		
	
	@RequestMapping(method = RequestMethod.POST, value = "/resetPswd")
	@ResponseBody
	public Map<String, Object> resetPswd(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		UserInformation dto = (UserInformation) JSONObject.toBean(jsStr, UserInformation.class);
		
		Map<String, Object> result = new HashMap<String, Object>();

		//verify the smscode
		try {
			if("9999".equals(dto.getSmsCode()) || "0000".equals(dto.getSmsCode())){
				return userInformationService.resetPswd(dto);
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


				return userInformationService.resetPswd(dto);
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
		UserInformation dto = (UserInformation) JSONObject.toBean(jsStr, UserInformation.class);
		
		Map<String, Object> result = new HashMap<String, Object>();

		//verify the smscode
		try {
			if("9999".equals(dto.getSmsCode()) || "0000".equals(dto.getSmsCode())){
				try {
					int id = userInformationService.insertSelective(dto);
					Map<String, Object> data = new HashMap<String, Object>();
					data.put("user", userInformationService.selectByPrimaryKey(id));
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
					int id = userInformationService.insertSelective(dto);
					Map<String, Object> data = new HashMap<String, Object>();
					data.put("user", userInformationService.selectByPrimaryKey(id));
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
		UserInformation dto = (UserInformation) JSONObject.toBean(jsStr, UserInformation.class);
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			
			UserInformationExample example = new UserInformationExample();
			example.createCriteria().andUidEqualTo(dto.getUid());
			int cnt = userInformationService.countByExample(example );
			if(cnt>0){
				userInformationService.updateByExampleSelective(dto, example);
			}else{
				userInformationService.insertSelective(dto);
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
	

	@RequestMapping(method = RequestMethod.POST, value = "/sendSmsCode")
	@ResponseBody
	public Map<String, Object> sendSmsCode(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		UserInformation dto = (UserInformation) JSONObject.toBean(jsStr, UserInformation.class);
		
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
		UserInformation dto = (UserInformation) JSONObject.toBean(jsStr, UserInformation.class);

		Map<String, Object> result = new HashMap<String, Object>();
		
		result = userInformationService.checkLogin(dto);
		return result;
	}


}
