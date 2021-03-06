package com.jzt.api.service.impl;

import java.util.List;
import java.util.Map;

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
	* 用途：后台管理查询城市列表2  包含外键province名称
	* 作者：廖凯红
	* 时间：20170418
	*/
	public List<Map> selectCityMapList(int startRow,int pageSize)
	{
		return cityMapper.selectCityMapList(startRow,pageSize);
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
	
	
	/**  
	* 用途：后台管理指定城市详情
	* 作者：廖凯红
	* 时间：20170413
	*/
	public City selectById(int id)
	{
		return cityMapper.selectByPrimaryKey(id);
	}
	
	
	/**  
	* 用途：后台管理新增或者修改城市
	* 作者：廖凯红
	* 时间：20170413
	*/
	public void saveOrUpdate(City record)
	{
		if(record.getId()!=null && record.getId()!=0)//update
		{
			City old = cityMapper.selectByPrimaryKey(record.getId());
			if(old==null)
			{
				cityMapper.insertSelective(record);
			}
			else 
			{
				cityMapper.updateByPrimaryKeySelective(record);
			}
			
		}
		else //insert
		{
			cityMapper.insertSelective(record);
		}
		
		
		
	}

}
