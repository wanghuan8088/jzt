package com.jzt.api.service;

import java.util.List;

import com.jzt.api.domain.City;

public interface CityService {
	
	/**  
	* 用途：后台管理查询城市列表
	* 作者：廖凯红
	* 时间：20170408
	*/
	public List<City> selectCityList(int startRow,int pageSize);
	
	/**  
	* 用途：后台管理删除制定城市
	* 作者：廖凯红
	* 时间：20170408
	*/
	public void deleteById(int id);
	
}
