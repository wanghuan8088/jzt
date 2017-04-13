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
	
	
	/**  
	* 用途：后台管理指定城市详情
	* 作者：廖凯红
	* 时间：20170413
	*/
	public City selectById(int id);
	
	
	/**  
	* 用途：后台管理新增或者修改城市
	* 作者：廖凯红
	* 时间：20170413
	*/
	public void saveOrUpdate(City record);
	
}
