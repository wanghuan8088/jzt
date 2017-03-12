package com.jzt.api.service;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.jzt.api.domain.AppUserFinanceFavorite;
import com.jzt.api.domain.AppUserFinanceFavoriteExample;

/**
 * Desc: AppUserFinanceFavoriteService
 * 
 * @author Kavin
 * @since  2017-Mar-6 
 */
public interface AppUserFinanceFavoriteService {

	/**  
	* @Title: save  
	* @Description: save 
	* @param @param record
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> save(AppUserFinanceFavorite record);

	/**  
	* @Title: delete  
	* @Description: delete 
	* @param @param record
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> delete(AppUserFinanceFavorite record);

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
	Map<String, Object> saveOrUpdate(AppUserFinanceFavorite record);
	
	/**  
	* @Title: queryListByPage  
	* @Description: queryListByPage 
	* @param @param record
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> queryListByPage(AppUserFinanceFavorite record);
	
	
	int countByExample(AppUserFinanceFavoriteExample example);

    int deleteByExample(AppUserFinanceFavoriteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppUserFinanceFavorite record);

    int insertSelective(AppUserFinanceFavorite record);

    List<AppUserFinanceFavorite> selectByExample(AppUserFinanceFavoriteExample example);

    AppUserFinanceFavorite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppUserFinanceFavorite record, @Param("example") AppUserFinanceFavoriteExample example);

    int updateByExample(@Param("record") AppUserFinanceFavorite record, @Param("example") AppUserFinanceFavoriteExample example);

    int updateByPrimaryKeySelective(AppUserFinanceFavorite record);

    int updateByPrimaryKey(AppUserFinanceFavorite record);
	
}