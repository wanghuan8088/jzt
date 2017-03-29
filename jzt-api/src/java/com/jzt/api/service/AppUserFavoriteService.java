package com.jzt.api.service;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.jzt.api.domain.AppUserFavorite;
import com.jzt.api.domain.AppUserFavoriteExample;

/**
 * Desc: AppUserFavoriteService
 * 
 * @author Kavin
 * @since  2017-Mar-6 
 */
public interface AppUserFavoriteService {

	/**  
	* @Title: save  
	* @Description: save 
	* @param @param record
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> save(AppUserFavorite record);

	/**  
	* @Title: delete  
	* @Description: delete 
	* @param @param record
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> delete(AppUserFavorite record);

	/**  
	* @Title: selectOneByPrimaryKey  
	* @Description: selectOneByPrimaryKey 
	* @param @param id
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> selectOneByPrimaryKey(Integer id);

	/**  
	* @Title: saveOrUpdate  
	* @Description: saveOrUpdate 
	* @param @param record
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> saveOrUpdate(AppUserFavorite record);
	
	/**  
	* @Title: queryListByPage  
	* @Description: queryListByPage 
	* @param @param record
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> queryListByPage(AppUserFavorite record);
	
	
	int countByExample(AppUserFavoriteExample example);

    int deleteByExample(AppUserFavoriteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppUserFavorite record);

    int insertSelective(AppUserFavorite record);

    List<AppUserFavorite> selectByExample(AppUserFavoriteExample example);

    AppUserFavorite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppUserFavorite record, @Param("example") AppUserFavoriteExample example);

    int updateByExample(@Param("record") AppUserFavorite record, @Param("example") AppUserFavoriteExample example);

    int updateByPrimaryKeySelective(AppUserFavorite record);

    int updateByPrimaryKey(AppUserFavorite record);
	
}