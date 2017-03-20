package com.jzt.api.dao;

import com.jzt.api.domain.SafeCert;
import com.jzt.api.domain.SafeCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SafeCertMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_cert
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(SafeCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_cert
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(SafeCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_cert
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_cert
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(SafeCert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_cert
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(SafeCert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_cert
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<SafeCert> selectByExample(SafeCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_cert
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    SafeCert selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_cert
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") SafeCert record, @Param("example") SafeCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_cert
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") SafeCert record, @Param("example") SafeCertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_cert
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(SafeCert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table safe_cert
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(SafeCert record);
}