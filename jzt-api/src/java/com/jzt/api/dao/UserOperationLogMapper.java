package com.jzt.api.dao;

import com.jzt.api.domain.UserOperationLog;
import com.jzt.api.domain.UserOperationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOperationLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operation_log
     *
     * @mbggenerated Tue Mar 21 07:52:29 CST 2017
     */
    int countByExample(UserOperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operation_log
     *
     * @mbggenerated Tue Mar 21 07:52:29 CST 2017
     */
    int deleteByExample(UserOperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operation_log
     *
     * @mbggenerated Tue Mar 21 07:52:29 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operation_log
     *
     * @mbggenerated Tue Mar 21 07:52:29 CST 2017
     */
    int insert(UserOperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operation_log
     *
     * @mbggenerated Tue Mar 21 07:52:29 CST 2017
     */
    int insertSelective(UserOperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operation_log
     *
     * @mbggenerated Tue Mar 21 07:52:29 CST 2017
     */
    List<UserOperationLog> selectByExample(UserOperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operation_log
     *
     * @mbggenerated Tue Mar 21 07:52:29 CST 2017
     */
    UserOperationLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operation_log
     *
     * @mbggenerated Tue Mar 21 07:52:29 CST 2017
     */
    int updateByExampleSelective(@Param("record") UserOperationLog record, @Param("example") UserOperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operation_log
     *
     * @mbggenerated Tue Mar 21 07:52:29 CST 2017
     */
    int updateByExample(@Param("record") UserOperationLog record, @Param("example") UserOperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operation_log
     *
     * @mbggenerated Tue Mar 21 07:52:29 CST 2017
     */
    int updateByPrimaryKeySelective(UserOperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operation_log
     *
     * @mbggenerated Tue Mar 21 07:52:29 CST 2017
     */
    int updateByPrimaryKey(UserOperationLog record);
}