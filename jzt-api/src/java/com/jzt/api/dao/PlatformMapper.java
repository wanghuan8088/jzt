package com.jzt.api.dao;

import com.jzt.api.domain.Platform;
import com.jzt.api.domain.PlatformExample;
import com.jzt.api.domain.ProblemPlat;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PlatformMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(PlatformExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(PlatformExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(Platform record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(Platform record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<Platform> selectByExample(PlatformExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    Platform selectByPrimaryKey(Integer id);

    Map selectMoreTableByPrimaryKey(Platform record);

    Map selectMoreForBank(Integer id);

    Map selectMoreForP2p(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") Platform record, @Param("example") PlatformExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") Platform record, @Param("example") PlatformExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(Platform record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(Platform record);
    
    List<Platform> selectByRegisteredCapital(@Param("tagType")Integer tagType, @Param("startRow")Integer startRow, @Param("pageSize")Integer pageSize);
    
    List<Platform> selectByUserId(@Param("uId")Integer uId, @Param("type")Integer type, @Param("startRow")Integer startRow, @Param("pageSize")Integer pageSize);

    List<Map> selectByUserIdForP2p(@Param("uId")Integer uId, @Param("type")Integer type, @Param("startRow")Integer startRow, @Param("pageSize")Integer pageSize);

    /**
     * liaokaihong 20170318
     */
    List<ProblemPlat> selectProblemPlatByState(@Param("state")Integer state);
    List<ProblemPlat> selectAllProblemPlat();
    List<ProblemPlat> selectProblemPlatByName(@Param("name")String name );
    List<ProblemPlat> selectProblemPlat(Platform record);
    
    /**
     * 根据平台名查找平台信息
     */
    Platform selectPlatformByName(@Param("name")String name);

    /**
     * 平台简介
     */
    Map description(Integer id);
    
}