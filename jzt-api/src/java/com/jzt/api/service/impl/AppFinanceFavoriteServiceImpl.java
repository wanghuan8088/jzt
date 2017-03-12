package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.AppFinanceFavoriteMapper;
import com.jzt.api.domain.AppFinanceFavorite;
import com.jzt.api.domain.AppFinanceFavoriteExample;
import com.jzt.api.service.AppFinanceFavoriteService;


/** 
* @ClassName: AppFinanceFavoriteServiceImpl 
* @Description: AppFinanceFavoriteServiceImpl class
* @author  Kavin
* @date 2017年3月10日 上午9:35:55 
*  
*/
@Service
public class AppFinanceFavoriteServiceImpl extends BaseService implements AppFinanceFavoriteService {

	@Autowired
	private AppFinanceFavoriteMapper appFinanceFavoriteMapper;
	
	/* (非 Javadoc)  
	* <p>Title: save</p>  
	* <p>Description: </p>  
	* @param record
	* @return  
	* @see com.jzt.api.service.AppFinanceFavoriteService#save(com.jzt.api.domain.AppFinanceFavorite)  
	*/
	@Override
	public Map<String, Object> save(AppFinanceFavorite record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			appFinanceFavoriteMapper.insertSelective(record);
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
	* @see com.jzt.api.service.AppFinanceFavoriteService#delete(com.jzt.api.domain.AppFinanceFavorite)  
	*/
	@Override
	public Map<String, Object> delete(AppFinanceFavorite record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			appFinanceFavoriteMapper.deleteByPrimaryKey(record.getId());
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
	* @see com.jzt.api.service.AppFinanceFavoriteService#selectOneByPrimaryKey(java.lang.Integer)  
	*/
	@Override
	public Map<String, Object> selectOneByPrimaryKey(Integer id) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			AppFinanceFavorite record = appFinanceFavoriteMapper.selectByPrimaryKey(id);
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
	* @see com.jzt.api.service.AppFinanceFavoriteService#saveOrUpdate(com.jzt.api.domain.AppFinanceFavorite)  
	*/
	@Override
	public Map<String, Object> saveOrUpdate(AppFinanceFavorite record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			
			if(record.getId()!=null && record.getId()!=0){
				
				AppFinanceFavorite dto = appFinanceFavoriteMapper.selectByPrimaryKey(record.getId());
				
				if(dto!=null ){
					appFinanceFavoriteMapper.updateByPrimaryKeySelective(record);
				}else{
					appFinanceFavoriteMapper.insertSelective(record);
				}
			}else{
				appFinanceFavoriteMapper.insertSelective(record);
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
	* @see com.jzt.api.service.AppFinanceFavoriteService#queryListByPage(com.jzt.api.domain.AppFinanceFavorite)  
	*/
	@Override
	public Map<String, Object> queryListByPage(AppFinanceFavorite record) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			AppFinanceFavoriteExample example = new AppFinanceFavoriteExample();
//			setOrderByClause(record, example);
			List<AppFinanceFavorite> list = appFinanceFavoriteMapper.selectByExample(example);
			if(list!=null ){
				result = generateNomalResult(list);
			}
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}
	
	
	@Override
	public int countByExample(AppFinanceFavoriteExample example){
		return appFinanceFavoriteMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(AppFinanceFavoriteExample example){
		return appFinanceFavoriteMapper.deleteByExample(example);
	}
    
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return appFinanceFavoriteMapper.deleteByPrimaryKey(id);
	}
    
    @Override
    public int insert(AppFinanceFavorite record) {
		return appFinanceFavoriteMapper.insert(record);
	}

	@Override
    public int insertSelective(AppFinanceFavorite record) {
		return appFinanceFavoriteMapper.insertSelective(record);
	}

	@Override
	public List<AppFinanceFavorite> selectByExample(AppFinanceFavoriteExample example) {
		return appFinanceFavoriteMapper.selectByExample(example);
	}

	@Override
    public AppFinanceFavorite selectByPrimaryKey(Integer id) {
		return appFinanceFavoriteMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(@Param("record") AppFinanceFavorite record, @Param("example") AppFinanceFavoriteExample example) {
		return appFinanceFavoriteMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") AppFinanceFavorite record, @Param("example") AppFinanceFavoriteExample example) {
		return appFinanceFavoriteMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(AppFinanceFavorite record) {
		return appFinanceFavoriteMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(AppFinanceFavorite record) {
		return appFinanceFavoriteMapper.updateByPrimaryKey(record);
	}
	
}
