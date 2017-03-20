package com.jzt.api.dao;

import com.jzt.api.domain.AppFinanceFavoriteOptions;
import com.jzt.api.domain.AppFinanceFavoriteOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppFinanceFavoriteOptionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_finance_favorite_options
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(AppFinanceFavoriteOptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_finance_favorite_options
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(AppFinanceFavoriteOptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_finance_favorite_options
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_finance_favorite_options
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(AppFinanceFavoriteOptions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_finance_favorite_options
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(AppFinanceFavoriteOptions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_finance_favorite_options
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<AppFinanceFavoriteOptions> selectByExample(AppFinanceFavoriteOptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_finance_favorite_options
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    AppFinanceFavoriteOptions selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_finance_favorite_options
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") AppFinanceFavoriteOptions record, @Param("example") AppFinanceFavoriteOptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_finance_favorite_options
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") AppFinanceFavoriteOptions record, @Param("example") AppFinanceFavoriteOptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_finance_favorite_options
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(AppFinanceFavoriteOptions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_finance_favorite_options
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(AppFinanceFavoriteOptions record);
}