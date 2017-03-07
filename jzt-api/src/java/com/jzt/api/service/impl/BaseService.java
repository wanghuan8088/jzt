package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.jzt.api.common.util.BizLogger;
import com.jzt.api.domain.BaseDomain;
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
	 * @param record
	 * @param example
	 */
	protected void setOrderByClause(BaseDomain record, UserInformationExample example) {
		String orderByClause = " id desc";
		System.out.println(record.getPage());
		
		int page = record.getPage()-1;//第几页
		int rows = record.getRows();//
		int ifrom = page*rows;
		if(record.getPage()>0 && record.getRows()>0){
			orderByClause += " limit "+ ifrom + ", "+rows;
		}
		example.setOrderByClause(orderByClause);;
	}

}
