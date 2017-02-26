package com.jzt.api.controller.base;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.jzt.api.common.util.BizLogger;

public class BaseController{
	public BizLogger logger = BizLogger.getLogger(this.getClass());
	
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	
	@Autowired
	protected RestTemplate restTemplate;

	
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	public HttpSession getSession() {
		return session;
	}
	public void setSession(HttpSession session) {
		this.session = session;
	}

	
	public String getRemoteIp() {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		ip = ip.split(",")[0];
		return ip;
	}
	
	/**
	 * @param record
	 * @param data
	 */
	public Map<String, Object> generateNomalResult(Object record) {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("record", record);
		result.put("data", data );
		result.put("res", "0");
		result.put("message", "Success");
		return result;
	}

	/**
	 * @param record
	 * @param data
	 */
	public Map<String, Object> generateNoDataResult(Object record) {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("record", record);
		result.put("res", "1");
		result.put("message", "No Data Found");
		result.put("data", data );
		
		return result;
	}

	/**
	 * @param e
	 */
	public Map<String, Object> generateErrorResult(Exception e) {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> data = new HashMap<String, Object>();
		result.put("data", data );
		result.put("res", "1");
		result.put("message", "Error-"+e.getMessage());
		return result;
	}
	
}
