package com.jzt.api.dao;

import com.jzt.api.domain.BankType;
import com.jzt.api.domain.BankTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(BankTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(BankTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(BankType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(BankType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<BankType> selectByExample(BankTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    BankType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") BankType record, @Param("example") BankTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") BankType record, @Param("example") BankTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(BankType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(BankType record);
}