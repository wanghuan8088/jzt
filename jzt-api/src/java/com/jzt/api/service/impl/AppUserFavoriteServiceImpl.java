package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.AppUserFavoriteMapper;
import com.jzt.api.domain.AppUserFavorite;
import com.jzt.api.domain.AppUserFavoriteExample;
import com.jzt.api.service.AppUserFavoriteService;


/** 
* @ClassName: AppUserFavoriteServiceImpl 
* @Description: AppUserFavoriteServiceImpl class
* @author  Kavin
* @date 2017年3月10日 上午9:35:55 
*  
*/
@Service
public class AppUserFavoriteServiceImpl extends BaseService implements AppUserFavoriteService {

	@Autowired
	private AppUserFavoriteMapper appUserFavoriteMapper;
	
	/* (非 Javadoc)  
	* <p>Title: save</p>  
	* <p>Description: </p>  
	* @param record
	* @return  
	* @see com.jzt.api.service.AppUserFavoriteService#save(com.jzt.api.domain.AppUserFavorite)  
	*/
	@Override
	public Map<String, Object> save(AppUserFavorite record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			appUserFavoriteMapper.insertSelective(record);
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
	* @see com.jzt.api.service.AppUserFavoriteService#delete(com.jzt.api.domain.AppUserFavorite)  
	*/
	@Override
	public Map<String, Object> delete(AppUserFavorite record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			appUserFavoriteMapper.deleteByPrimaryKey(record.getId());
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
	* @see com.jzt.api.service.AppUserFavoriteService#selectOneByPrimaryKey(java.lang.Integer)  
	*/
	@Override
	public Map<String, Object> selectOneByPrimaryKey(Integer id) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			AppUserFavorite record = appUserFavoriteMapper.selectByPrimaryKey(id);
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
	* @see com.jzt.api.service.AppUserFavoriteService#saveOrUpdate(com.jzt.api.domain.AppUserFavorite)  
	*/
	@Override
	public Map<String, Object> saveOrUpdate(AppUserFavorite record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			
			if(record.getId()!=null && record.getId()!=0){
				
				AppUserFavorite dto = appUserFavoriteMapper.selectByPrimaryKey(record.getId());
				
				if(dto!=null ){
					appUserFavoriteMapper.updateByPrimaryKeySelective(record);
				}else{
					appUserFavoriteMapper.insertSelective(record);
				}
			}else{
				appUserFavoriteMapper.insertSelective(record);
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
	* @see com.jzt.api.service.AppUserFavoriteService#queryListByPage(com.jzt.api.domain.AppUserFavorite)  
	*/
	@Override
	public Map<String, Object> queryListByPage(AppUserFavorite record) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			AppUserFavoriteExample example = new AppUserFavoriteExample();
//			setOrderByClause(record, example);
			List<AppUserFavorite> list = appUserFavoriteMapper.selectByExample(example);
			if(list!=null ){
				result = generateNomalResult(list);
			}
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}
	
	
	@Override
	public int countByExample(AppUserFavoriteExample example){
		return appUserFavoriteMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(AppUserFavoriteExample example){
		return appUserFavoriteMapper.deleteByExample(example);
	}
    
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return appUserFavoriteMapper.deleteByPrimaryKey(id);
	}
    
    @Override
    public int insert(AppUserFavorite record) {
		return appUserFavoriteMapper.insert(record);
	}

	@Override
    public int insertSelective(AppUserFavorite record) {
		return appUserFavoriteMapper.insertSelective(record);
	}

	@Override
	public List<AppUserFavorite> selectByExample(AppUserFavoriteExample example) {
		return appUserFavoriteMapper.selectByExample(example);
	}

	@Override
    public AppUserFavorite selectByPrimaryKey(Integer id) {
		return appUserFavoriteMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(@Param("record") AppUserFavorite record, @Param("example") AppUserFavoriteExample example) {
		return appUserFavoriteMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") AppUserFavorite record, @Param("example") AppUserFavoriteExample example) {
		return appUserFavoriteMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(AppUserFavorite record) {
		return appUserFavoriteMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(AppUserFavorite record) {
		return appUserFavoriteMapper.updateByPrimaryKey(record);
	}
	
}
