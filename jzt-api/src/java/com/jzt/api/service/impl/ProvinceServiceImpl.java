package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.ProvinceMapper;
import com.jzt.api.domain.Province;
import com.jzt.api.domain.ProvinceExample;
import com.jzt.api.service.ProvinceService;

/**
 * Desc: ProvinceServiceImpl class
 * 
 * @author Kavin
 * @since  2017-Mar-6 
 */
@Service
public class ProvinceServiceImpl extends BaseService implements ProvinceService {

	@Autowired
	private ProvinceMapper provinceMapper;
	
	@Override
	public Map<String, Object> save(Province record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			provinceMapper.insertSelective(record);
			result = generateNomalResult(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}

	@Override
	public Map<String, Object> delete(Province record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			provinceMapper.deleteByPrimaryKey(record.getId());
			result = generateNomalResult(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}

	

	@Override
	public Map<String, Object> selectOneByPrimaryKey(Integer id) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			Province record = provinceMapper.selectByPrimaryKey(id);
			if(record!=null ){
				result = generateNomalResult(record);
			}
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> saveOrUpdate(Province record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			
			if(record.getId()!=null && record.getId()!=0){
				
				Province dto = provinceMapper.selectByPrimaryKey(record.getId());
				
				if(dto!=null ){
					provinceMapper.updateByPrimaryKeySelective(record);
				}else{
					provinceMapper.insertSelective(record);
				}
			}else{
				provinceMapper.insertSelective(record);
			}
			
			result = generateNomalResult(record);
			
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}
	
	@Override
	public Map<String, Object> queryListByPage(Province record) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			ProvinceExample example = new ProvinceExample();
//			setOrderByClause(record, example);
			List<Province> list = provinceMapper.selectByExample(example);
			if(list!=null ){
				result = generateNomalResult(list);
			}
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}
	
	
	@Override
	public int countByExample(ProvinceExample example){
		return provinceMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ProvinceExample example){
		return provinceMapper.deleteByExample(example);
	}
    
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return provinceMapper.deleteByPrimaryKey(id);
	}
    
    @Override
    public int insert(Province record) {
		return provinceMapper.insert(record);
	}

	@Override
    public int insertSelective(Province record) {
		return provinceMapper.insertSelective(record);
	}

	@Override
	public List<Province> selectByExample(ProvinceExample example) {
		return provinceMapper.selectByExample(example);
	}

	@Override
    public Province selectByPrimaryKey(Integer id) {
		return provinceMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(@Param("record") Province record, @Param("example") ProvinceExample example) {
		return provinceMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") Province record, @Param("example") ProvinceExample example) {
		return provinceMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Province record) {
		return provinceMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Province record) {
		return provinceMapper.updateByPrimaryKey(record);
	}
	
}
