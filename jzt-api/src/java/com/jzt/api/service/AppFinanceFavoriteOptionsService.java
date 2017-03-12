package com.jzt.api.service;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.jzt.api.domain.AppFinanceFavoriteOptions;
import com.jzt.api.domain.AppFinanceFavoriteOptionsExample;

/**
 * Desc: AppFinanceFavoriteOptionsService
 * 
 * @author Kavin
 * @since  2017-Mar-6 
 */
public interface AppFinanceFavoriteOptionsService {

	/**  
	* @Title: save  
	* @Description: save 
	* @param @param record
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> save(AppFinanceFavoriteOptions record);

	/**  
	* @Title: delete  
	* @Description: delete 
	* @param @param record
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> delete(AppFinanceFavoriteOptions record);

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
	Map<String, Object> saveOrUpdate(AppFinanceFavoriteOptions record);
	
	/**  
	* @Title: queryListByPage  
	* @Description: queryListByPage 
	* @param @param record
	* @param @return    设定文件  
	* @return Map<String,Object>    返回类型  
	* @throws  
	*/
	Map<String, Object> queryListByPage(AppFinanceFavoriteOptions record);
	
	
	int countByExample(AppFinanceFavoriteOptionsExample example);

    int deleteByExample(AppFinanceFavoriteOptionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppFinanceFavoriteOptions record);

    int insertSelective(AppFinanceFavoriteOptions record);

    List<AppFinanceFavoriteOptions> selectByExample(AppFinanceFavoriteOptionsExample example);

    AppFinanceFavoriteOptions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppFinanceFavoriteOptions record, @Param("example") AppFinanceFavoriteOptionsExample example);

    int updateByExample(@Param("record") AppFinanceFavoriteOptions record, @Param("example") AppFinanceFavoriteOptionsExample example);

    int updateByPrimaryKeySelective(AppFinanceFavoriteOptions record);

    int updateByPrimaryKey(AppFinanceFavoriteOptions record);
	
}