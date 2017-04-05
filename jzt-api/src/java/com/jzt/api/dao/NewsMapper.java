package com.jzt.api.dao;

import com.jzt.api.domain.News;
import com.jzt.api.domain.NewsExample;
import com.jzt.api.domain.NewsWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer nid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(NewsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(NewsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<NewsWithBLOBs> selectByExampleWithBLOBs(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<News> selectByExample(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    NewsWithBLOBs selectByPrimaryKey(Integer nid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") NewsWithBLOBs record, @Param("example") NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") NewsWithBLOBs record, @Param("example") NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(NewsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(NewsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(News record);

    int removeByPrimaryKey(News record);

}