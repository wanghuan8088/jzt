package com.jzt.api.dao;

import com.jzt.api.domain.BankEvalCopy;
import com.jzt.api.domain.BankEvalCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankEvalCopyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_eval_copy
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(BankEvalCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_eval_copy
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(BankEvalCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_eval_copy
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_eval_copy
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(BankEvalCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_eval_copy
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(BankEvalCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_eval_copy
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<BankEvalCopy> selectByExample(BankEvalCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_eval_copy
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    BankEvalCopy selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_eval_copy
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") BankEvalCopy record, @Param("example") BankEvalCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_eval_copy
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") BankEvalCopy record, @Param("example") BankEvalCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_eval_copy
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(BankEvalCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_eval_copy
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(BankEvalCopy record);
}