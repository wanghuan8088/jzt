package com.jzt.api.dao;

import com.jzt.api.domain.EveryweekPlatVisit;
import com.jzt.api.domain.EveryweekPlatVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EveryweekPlatVisitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table everyweek_plat_visit
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(EveryweekPlatVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table everyweek_plat_visit
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(EveryweekPlatVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table everyweek_plat_visit
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table everyweek_plat_visit
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(EveryweekPlatVisit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table everyweek_plat_visit
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(EveryweekPlatVisit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table everyweek_plat_visit
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<EveryweekPlatVisit> selectByExample(EveryweekPlatVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table everyweek_plat_visit
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    EveryweekPlatVisit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table everyweek_plat_visit
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") EveryweekPlatVisit record, @Param("example") EveryweekPlatVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table everyweek_plat_visit
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") EveryweekPlatVisit record, @Param("example") EveryweekPlatVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table everyweek_plat_visit
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(EveryweekPlatVisit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table everyweek_plat_visit
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(EveryweekPlatVisit record);
}