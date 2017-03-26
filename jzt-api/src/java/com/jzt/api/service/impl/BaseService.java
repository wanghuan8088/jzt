package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.jzt.api.common.util.BizLogger;
import com.jzt.api.domain.BaseDomain;
import com.jzt.api.domain.BaseExample;
import com.jzt.api.domain.UserInformationExample;


public class BaseService {

	public BizLogger logger = BizLogger.getLogger(this.getClass());
	
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
	public Map<String, Object> generateNomalResult(Object record,String msg) {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("record", record);
		result.put("data", data );
		result.put("res", "0");
		result.put("message", msg);
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
	
	/**
	 * @param e
	 */
	public Map<String, Object> generateErrorResult(String msg) {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> data = new HashMap<String, Object>();
		result.put("data", data );
		result.put("res", "1");
		result.put("message", msg);
		return result;
	}
	
	/**
	 * @param e
	 */
	public Map<String, Object> generateErrorResult(Object record,String msg) {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("record", record);
		result.put("data", data );
		result.put("res", "1");
		result.put("message", msg);
		return result;
	}

	/**
	 * @param record
	 * @param example
	 */
	protected void setOrderByClause(BaseDomain record, BaseExample example) {
		String orderByClause = " id desc";
		setLimit(record, example, orderByClause);
	}

	/**  
	* @Title: setLimit  
	* @Description: setLimit 
	* @param @param record
	* @param @param example
	* @param @param orderByClause    设定文件  
	* @return void    返回类型  
	* @throws  
	*/
	private void setLimit(BaseDomain record, BaseExample example,
			String orderByClause) {
		System.out.println(record.getStartPage());
		
		if(record.getPageSize()>0 && record.getStartPage()>0){
			orderByClause += " limit "+ (record.getStartPage()-1)*record.getPageSize() + ", "+record.getPageSize();
		}
		example.setOrderByClause(orderByClause);
	}
	
	/**
	 * @param record
	 * @param example
	 */
	protected void setOrderByClause(BaseDomain record, BaseExample example, String orderByClause) {
		setLimit(record, example, orderByClause);
	}
	
}
