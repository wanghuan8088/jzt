package com.jzt.api.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.jzt.api.domain.Province;
import com.jzt.api.domain.ProvinceExample;

/**
 * Desc: ProvinceService
 * 
 * @author Kavin
 * @since  2017-Mar-6 
 */
public interface ProvinceService {

	Map<String, Object> save(Province record);

	Map<String, Object> delete(Province record);

	Map<String, Object> selectOneByPrimaryKey(Integer id);

	Map<String, Object> saveOrUpdate(Province record);
	
	Map<String, Object> queryListByPage(Province record);
	
	
	int countByExample(ProvinceExample example);

    int deleteByExample(ProvinceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Province record);

    int insertSelective(Province record);

    List<Province> selectByExample(ProvinceExample example);

    Province selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Province record, @Param("example") ProvinceExample example);

    int updateByExample(@Param("record") Province record, @Param("example") ProvinceExample example);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
	
}