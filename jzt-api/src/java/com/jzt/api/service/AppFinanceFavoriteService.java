package com.jzt.api.service;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.jzt.api.domain.AppFinanceFavorite;
import com.jzt.api.domain.AppFinanceFavoriteExample;

/**
 * Desc: AppFinanceFavoriteService
 * 
 * @author Kavin
 * @since  2017-Mar-6 
 */
public interface AppFinanceFavoriteService {

	/**  
	* @Title: save  
	* @Description: save 
	* @param @param record
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> save(AppFinanceFavorite record);

	/**  
	* @Title: delete  
	* @Description: delete 
	* @param @param record
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> delete(AppFinanceFavorite record);

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
	Map<String, Object> saveOrUpdate(AppFinanceFavorite record);
	
	/**  
	* @Title: queryListByPage  
	* @Description: queryListByPage 
	* @param @param record
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> queryListByPage(AppFinanceFavorite record);
	
	
	int countByExample(AppFinanceFavoriteExample example);

    int deleteByExample(AppFinanceFavoriteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppFinanceFavorite record);

    int insertSelective(AppFinanceFavorite record);

    List<AppFinanceFavorite> selectByExample(AppFinanceFavoriteExample example);

    AppFinanceFavorite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppFinanceFavorite record, @Param("example") AppFinanceFavoriteExample example);

    int updateByExample(@Param("record") AppFinanceFavorite record, @Param("example") AppFinanceFavoriteExample example);

    int updateByPrimaryKeySelective(AppFinanceFavorite record);

    int updateByPrimaryKey(AppFinanceFavorite record);
	
}