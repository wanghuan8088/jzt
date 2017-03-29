package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.AppUserFinanceFavoriteMapper;
import com.jzt.api.domain.AppUserFinanceFavorite;
import com.jzt.api.domain.AppUserFinanceFavoriteExample;
import com.jzt.api.service.AppUserFinanceFavoriteService;


/** 
* @ClassName: AppUserFinanceFavoriteServiceImpl 
* @Description: AppUserFinanceFavoriteServiceImpl class
* @author  Kavin
* @date 2017年3月10日 上午9:35:55 
*  
*/
@Service
public class AppUserFinanceFavoriteServiceImpl extends BaseService implements AppUserFinanceFavoriteService {

	@Autowired
	private AppUserFinanceFavoriteMapper appUserFinanceFavoriteMapper;
	
	/* (非 Javadoc)  
	* <p>Title: save</p>  
	* <p>Description: </p>  
	* @param record
	* @return  
	* @see com.jzt.api.service.AppUserFinanceFavoriteService#save(com.jzt.api.domain.AppUserFinanceFavorite)  
	*/
	@Override
	public Map<String, Object> save(AppUserFinanceFavorite record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			appUserFinanceFavoriteMapper.insertSelective(record);
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
	* @see com.jzt.api.service.AppUserFinanceFavoriteService#delete(com.jzt.api.domain.AppUserFinanceFavorite)  
	*/
	@Override
	public Map<String, Object> delete(AppUserFinanceFavorite record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			appUserFinanceFavoriteMapper.deleteByPrimaryKey(record.getId());
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
	* @see com.jzt.api.service.AppUserFinanceFavoriteService#selectOneByPrimaryKey(java.lang.Integer)  
	*/
	@Override
	public Map<String, Object> selectOneByPrimaryKey(Integer id) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			AppUserFinanceFavorite record = appUserFinanceFavoriteMapper.selectByPrimaryKey(id);
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
	* @see com.jzt.api.service.AppUserFinanceFavoriteService#saveOrUpdate(com.jzt.api.domain.AppUserFinanceFavorite)  
	*/
	@Override
	public Map<String, Object> saveOrUpdate(AppUserFinanceFavorite record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			
			if(record.getId()!=null && record.getId()!=0){
				
				AppUserFinanceFavorite dto = appUserFinanceFavoriteMapper.selectByPrimaryKey(record.getId());
				
				if(dto!=null ){
					appUserFinanceFavoriteMapper.updateByPrimaryKeySelective(record);
				}else{
					appUserFinanceFavoriteMapper.insertSelective(record);
				}
			}else{
				appUserFinanceFavoriteMapper.insertSelective(record);
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
	* @see com.jzt.api.service.AppUserFinanceFavoriteService#queryListByPage(com.jzt.api.domain.AppUserFinanceFavorite)  
	*/
	@Override
	public Map<String, Object> queryListByPage(AppUserFinanceFavorite record) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			AppUserFinanceFavoriteExample example = new AppUserFinanceFavoriteExample();
//			setOrderByClause(record, example);
			List<AppUserFinanceFavorite> list = appUserFinanceFavoriteMapper.selectByExample(example);
			if(list!=null ){
				result = generateNomalResult(list);
			}
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}
	
	
	@Override
	public int countByExample(AppUserFinanceFavoriteExample example){
		return appUserFinanceFavoriteMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(AppUserFinanceFavoriteExample example){
		return appUserFinanceFavoriteMapper.deleteByExample(example);
	}
    
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return appUserFinanceFavoriteMapper.deleteByPrimaryKey(id);
	}
    
    @Override
    public int insert(AppUserFinanceFavorite record) {
		return appUserFinanceFavoriteMapper.insert(record);
	}

	@Override
    public int insertSelective(AppUserFinanceFavorite record) {
		return appUserFinanceFavoriteMapper.insertSelective(record);
	}

	@Override
	public List<AppUserFinanceFavorite> selectByExample(AppUserFinanceFavoriteExample example) {
		return appUserFinanceFavoriteMapper.selectByExample(example);
	}

	@Override
    public AppUserFinanceFavorite selectByPrimaryKey(Integer id) {
		return appUserFinanceFavoriteMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(@Param("record") AppUserFinanceFavorite record, @Param("example") AppUserFinanceFavoriteExample example) {
		return appUserFinanceFavoriteMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") AppUserFinanceFavorite record, @Param("example") AppUserFinanceFavoriteExample example) {
		return appUserFinanceFavoriteMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(AppUserFinanceFavorite record) {
		return appUserFinanceFavoriteMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(AppUserFinanceFavorite record) {
		return appUserFinanceFavoriteMapper.updateByPrimaryKey(record);
	}
	
}
