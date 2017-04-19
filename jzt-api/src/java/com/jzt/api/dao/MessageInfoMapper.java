package com.jzt.api.dao;

import com.jzt.api.domain.MessageInfo;
import com.jzt.api.domain.MessageInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_info
     *
     * @mbggenerated Sun Mar 26 09:22:45 CST 2017
     */
    int countByExample(MessageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_info
     *
     * @mbggenerated Sun Mar 26 09:22:45 CST 2017
     */
    int deleteByExample(MessageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_info
     *
     * @mbggenerated Sun Mar 26 09:22:45 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_info
     *
     * @mbggenerated Sun Mar 26 09:22:45 CST 2017
     */
    int insert(MessageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_info
     *
     * @mbggenerated Sun Mar 26 09:22:45 CST 2017
     */
    int insertSelective(MessageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_info
     *
     * @mbggenerated Sun Mar 26 09:22:45 CST 2017
     */
    List<MessageInfo> selectByExample(MessageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_info
     *
     * @mbggenerated Sun Mar 26 09:22:45 CST 2017
     */
    MessageInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_info
     *
     * @mbggenerated Sun Mar 26 09:22:45 CST 2017
     */
    int updateByExampleSelective(@Param("record") MessageInfo record, @Param("example") MessageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_info
     *
     * @mbggenerated Sun Mar 26 09:22:45 CST 2017
     */
    int updateByExample(@Param("record") MessageInfo record, @Param("example") MessageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_info
     *
     * @mbggenerated Sun Mar 26 09:22:45 CST 2017
     */
    int updateByPrimaryKeySelective(MessageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_info
     *
     * @mbggenerated Sun Mar 26 09:22:45 CST 2017
     */
    int updateByPrimaryKey(MessageInfo record);
}