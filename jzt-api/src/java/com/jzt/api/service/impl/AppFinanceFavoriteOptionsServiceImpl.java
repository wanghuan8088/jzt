package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.AppFinanceFavoriteOptionsMapper;
import com.jzt.api.domain.AppFinanceFavoriteOptions;
import com.jzt.api.domain.AppFinanceFavoriteOptionsExample;
import com.jzt.api.service.AppFinanceFavoriteOptionsService;


/** 
* @ClassName: AppFinanceFavoriteOptionsServiceImpl 
* @Description: AppFinanceFavoriteOptionsServiceImpl class
* @author  Kavin
* @date 2017年3月10日 上午9:35:55 
*  
*/
@Service
public class AppFinanceFavoriteOptionsServiceImpl extends BaseService implements AppFinanceFavoriteOptionsService {

	@Autowired
	private AppFinanceFavoriteOptionsMapper appFinanceFavoriteOptionsMapper;
	
	/* (非 Javadoc)  
	* <p>Title: save</p>  
	* <p>Description: </p>  
	* @param record
	* @return  
	* @see com.jzt.api.service.AppFinanceFavoriteOptionsService#save(com.jzt.api.domain.AppFinanceFavoriteOptions)  
	*/
	@Override
	public Map<String, Object> save(AppFinanceFavoriteOptions record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			appFinanceFavoriteOptionsMapper.insertSelective(record);
			result = generateNomalResult(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}

	/* (非 Javadoc)  
	* <p>Title: delete</p>  
	* <p>Description: </p>  
	* @param record
	* @return  
	* @see com.jzt.api.service.AppFinanceFavoriteOptionsService#delete(com.jzt.api.domain.AppFinanceFavoriteOptions)  
	*/
	@Override
	public Map<String, Object> delete(AppFinanceFavoriteOptions record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			appFinanceFavoriteOptionsMapper.deleteByPrimaryKey(record.getId());
			result = generateNomalResult(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}

	

	/* (非 Javadoc)  
	* <p>Title: selectOneByPrimaryKey</p>  
	* <p>Description: </p>  
	* @param id
	* @return  
	* @see com.jzt.api.service.AppFinanceFavoriteOptionsService#selectOneByPrimaryKey(java.lang.Integer)  
	*/
	@Override
	public Map<String, Object> selectOneByPrimaryKey(Integer id) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			AppFinanceFavoriteOptions record = appFinanceFavoriteOptionsMapper.selectByPrimaryKey(id);
			if(record!=null ){
				result = generateNomalResult(record);
			}
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	/* (非 Javadoc)  
	* <p>Title: saveOrUpdate</p>  
	* <p>Description: </p>  
	* @param record
	* @return  
	* @see com.jzt.api.service.AppFinanceFavoriteOptionsService#saveOrUpdate(com.jzt.api.domain.AppFinanceFavoriteOptions)  
	*/
	@Override
	public Map<String, Object> saveOrUpdate(AppFinanceFavoriteOptions record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			
			if(record.getId()!=null && record.getId()!=0){
				
				AppFinanceFavoriteOptions dto = appFinanceFavoriteOptionsMapper.selectByPrimaryKey(record.getId());
				
				if(dto!=null ){
					appFinanceFavoriteOptionsMapper.updateByPrimaryKeySelective(record);
				}else{
					appFinanceFavoriteOptionsMapper.insertSelective(record);
				}
			}else{
				appFinanceFavoriteOptionsMapper.insertSelective(record);
			}
			
			result = generateNomalResult(record);
			
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}
	
	/* (非 Javadoc)  
	* <p>Title: queryListByPage</p>  
	* <p>Description: </p>  
	* @param record
	* @return  
	* @see com.jzt.api.service.AppFinanceFavoriteOptionsService#queryListByPage(com.jzt.api.domain.AppFinanceFavoriteOptions)  
	*/
	@Override
	public Map<String, Object> queryListByPage(AppFinanceFavoriteOptions record) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			AppFinanceFavoriteOptionsExample example = new AppFinanceFavoriteOptionsExample();
//			setOrderByClause(record, example);
			List<AppFinanceFavoriteOptions> list = appFinanceFavoriteOptionsMapper.selectByExample(example);
			if(list!=null ){
				result = generateNomalResult(list);
			}
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}
	
	
	@Override
	public int countByExample(AppFinanceFavoriteOptionsExample example){
		return appFinanceFavoriteOptionsMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(AppFinanceFavoriteOptionsExample example){
		return appFinanceFavoriteOptionsMapper.deleteByExample(example);
	}
    
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return appFinanceFavoriteOptionsMapper.deleteByPrimaryKey(id);
	}
    
    @Override
    public int insert(AppFinanceFavoriteOptions record) {
		return appFinanceFavoriteOptionsMapper.insert(record);
	}

	@Override
    public int insertSelective(AppFinanceFavoriteOptions record) {
		return appFinanceFavoriteOptionsMapper.insertSelective(record);
	}

	@Override
	public List<AppFinanceFavoriteOptions> selectByExample(AppFinanceFavoriteOptionsExample example) {
		return appFinanceFavoriteOptionsMapper.selectByExample(example);
	}

	@Override
    public AppFinanceFavoriteOptions selectByPrimaryKey(Integer id) {
		return appFinanceFavoriteOptionsMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(@Param("record") AppFinanceFavoriteOptions record, @Param("example") AppFinanceFavoriteOptionsExample example) {
		return appFinanceFavoriteOptionsMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") AppFinanceFavoriteOptions record, @Param("example") AppFinanceFavoriteOptionsExample example) {
		return appFinanceFavoriteOptionsMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(AppFinanceFavoriteOptions record) {
		return appFinanceFavoriteOptionsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(AppFinanceFavoriteOptions record) {
		return appFinanceFavoriteOptionsMapper.updateByPrimaryKey(record);
	}
	
}
