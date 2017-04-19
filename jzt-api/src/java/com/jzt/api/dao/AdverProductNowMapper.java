package com.jzt.api.dao;

import com.jzt.api.domain.AdverProductNow;
import com.jzt.api.domain.AdverProductNowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdverProductNowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adver_product_now
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    int countByExample(AdverProductNowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adver_product_now
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    int deleteByExample(AdverProductNowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adver_product_now
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adver_product_now
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    int insert(AdverProductNow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adver_product_now
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    int insertSelective(AdverProductNow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adver_product_now
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    List<AdverProductNow> selectByExample(AdverProductNowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adver_product_now
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    AdverProductNow selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adver_product_now
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    int updateByExampleSelective(@Param("record") AdverProductNow record, @Param("example") AdverProductNowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adver_product_now
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    int updateByExample(@Param("record") AdverProductNow record, @Param("example") AdverProductNowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adver_product_now
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    int updateByPrimaryKeySelective(AdverProductNow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adver_product_now
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    int updateByPrimaryKey(AdverProductNow record);
}