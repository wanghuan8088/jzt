package com.jzt.api.dao;

import com.jzt.api.domain.AppUserFinanceFavorite;
import com.jzt.api.domain.AppUserFinanceFavoriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppUserFinanceFavoriteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user_finance_favorite
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(AppUserFinanceFavoriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user_finance_favorite
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(AppUserFinanceFavoriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user_finance_favorite
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user_finance_favorite
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(AppUserFinanceFavorite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user_finance_favorite
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(AppUserFinanceFavorite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user_finance_favorite
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<AppUserFinanceFavorite> selectByExample(AppUserFinanceFavoriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user_finance_favorite
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    AppUserFinanceFavorite selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user_finance_favorite
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") AppUserFinanceFavorite record, @Param("example") AppUserFinanceFavoriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user_finance_favorite
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") AppUserFinanceFavorite record, @Param("example") AppUserFinanceFavoriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user_finance_favorite
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(AppUserFinanceFavorite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user_finance_favorite
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(AppUserFinanceFavorite record);
}