package com.jzt.api.dao;

import com.jzt.api.domain.Charge;
import com.jzt.api.domain.ChargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charge
     *
     * @mbggenerated Tue Mar 14 20:08:38 CST 2017
     */
    int countByExample(ChargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charge
     *
     * @mbggenerated Tue Mar 14 20:08:38 CST 2017
     */
    int deleteByExample(ChargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charge
     *
     * @mbggenerated Tue Mar 14 20:08:38 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charge
     *
     * @mbggenerated Tue Mar 14 20:08:38 CST 2017
     */
    int insert(Charge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charge
     *
     * @mbggenerated Tue Mar 14 20:08:38 CST 2017
     */
    int insertSelective(Charge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charge
     *
     * @mbggenerated Tue Mar 14 20:08:38 CST 2017
     */
    List<Charge> selectByExample(ChargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charge
     *
     * @mbggenerated Tue Mar 14 20:08:38 CST 2017
     */
    Charge selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charge
     *
     * @mbggenerated Tue Mar 14 20:08:38 CST 2017
     */
    int updateByExampleSelective(@Param("record") Charge record, @Param("example") ChargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charge
     *
     * @mbggenerated Tue Mar 14 20:08:38 CST 2017
     */
    int updateByExample(@Param("record") Charge record, @Param("example") ChargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charge
     *
     * @mbggenerated Tue Mar 14 20:08:38 CST 2017
     */
    int updateByPrimaryKeySelective(Charge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charge
     *
     * @mbggenerated Tue Mar 14 20:08:38 CST 2017
     */
    int updateByPrimaryKey(Charge record);
}