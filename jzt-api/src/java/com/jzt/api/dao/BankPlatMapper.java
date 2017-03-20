package com.jzt.api.dao;

import com.jzt.api.domain.BankPlat;
import com.jzt.api.domain.BankPlatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankPlatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_plat
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(BankPlatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_plat
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(BankPlatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_plat
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_plat
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(BankPlat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_plat
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(BankPlat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_plat
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<BankPlat> selectByExample(BankPlatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_plat
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    BankPlat selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_plat
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") BankPlat record, @Param("example") BankPlatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_plat
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") BankPlat record, @Param("example") BankPlatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_plat
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(BankPlat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_plat
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(BankPlat record);
}