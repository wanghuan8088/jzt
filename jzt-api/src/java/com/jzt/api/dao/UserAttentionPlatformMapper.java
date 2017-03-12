package com.jzt.api.dao;

import com.jzt.api.domain.UserAttentionPlatform;
import com.jzt.api.domain.UserAttentionPlatformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAttentionPlatformMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention_platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(UserAttentionPlatformExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention_platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(UserAttentionPlatformExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention_platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention_platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(UserAttentionPlatform record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention_platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(UserAttentionPlatform record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention_platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<UserAttentionPlatform> selectByExample(UserAttentionPlatformExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention_platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    UserAttentionPlatform selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention_platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") UserAttentionPlatform record, @Param("example") UserAttentionPlatformExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention_platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") UserAttentionPlatform record, @Param("example") UserAttentionPlatformExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention_platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(UserAttentionPlatform record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention_platform
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(UserAttentionPlatform record);
}