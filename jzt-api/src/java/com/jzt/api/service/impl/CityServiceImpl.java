package com.jzt.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.CityMapper;
import com.jzt.api.domain.City;
import com.jzt.api.service.CityService;


@Service
public class CityServiceImpl implements CityService{
	
	
	@Autowired
	CityMapper cityMapper;
	
	
	/**  
	* 用途：后台管理查询城市列表
	* 作者：廖凯红
	* 时间：20170408
	*/
	@Override
	public List<City> selectCityList(int startRow,int pageSize)
	{
		return cityMapper.selectCityList(startRow,pageSize);
	}
	
	
	/**  
	* 用途：后台管理删除制定城市
	* 作者：廖凯红
	* 时间：20170408
	*/
	@Override
	public void deleteById(int id)
	{
		cityMapper.deleteByPrimaryKey(id);
	}

}
