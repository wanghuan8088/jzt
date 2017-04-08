package com.jzt.api.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sun.misc.BASE64Decoder;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.AppFinanceFavorite;
import com.jzt.api.domain.AppFinanceFavoriteExample;
import com.jzt.api.service.AppFinanceFavoriteService;
import com.sun.org.apache.bcel.internal.generic.NEW;

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
	public Map<String, Object> query(){
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
	
	@RequestMapping(value = "/queryTest")
	@ResponseBody
	public Map<String, Object> queryTest(HttpServletRequest request, HttpServletResponse response){
		System.out.println("---------------Start");
		System.out.println(request);
		
		System.out.println("---------------Heders----------------------");
		Enumeration headerNames = request.getHeaderNames();
	    while (headerNames.hasMoreElements()) {
	        String key = (String) headerNames.nextElement();
	        String value = request.getHeader(key);
	        System.out.println(key+"="+value);
	    }
	    System.out.println("---------------Heders----------------------");
		
	    String jwtHeader = request.getHeader("x-jwt-assertion");
	    System.out.println("---------------Heders x-jwt-assertion----------------------");
	    System.out.println(jwtHeader);
	    try {
	    	
	    	String[] jwtArray = jwtHeader.split("\\.");
			if(jwtArray.length>1){
				System.out.println("----------JWT Header ---------");
				System.out.println( new String( new BASE64Decoder().decodeBuffer(jwtArray[0])) );
				System.out.println("----------JWT Payload jsonheader ---------");
				String jwtPayload  = new String( new BASE64Decoder().decodeBuffer(jwtArray[1]) );
				System.out.println(jwtPayload);
				
				//get API context from header
				String strAPIContext = getAPIContextFromHeader(jwtPayload);
				System.out.println("The API context in header is:"+strAPIContext);
			}
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	    Map<String, Object> result = new HashMap<String, Object>();
		
		return result;
	}
	
	private static String getAPIContextFromHeader(String jwtPayload)
			throws IOException, JsonParseException, JsonMappingException {
		String strAPIContext = null;
		ObjectMapper mapper = new ObjectMapper();
		HashMap map = mapper.readValue(jwtPayload, HashMap.class);
		strAPIContext = (String) map.get("http://wso2.org/claims/apicontext");
		return strAPIContext;
	}
	
	

}
