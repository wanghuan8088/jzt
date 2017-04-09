package com.jzt.api.dao;

import com.jzt.api.domain.P2pDynamic;
import com.jzt.api.domain.P2pDynamicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface P2pDynamicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_dynamic
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(P2pDynamicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_dynamic
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(P2pDynamicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_dynamic
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_dynamic
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(P2pDynamic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_dynamic
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(P2pDynamic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_dynamic
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<P2pDynamic> selectByExample(P2pDynamicExample example);

    List<Map> selectByTurnover(P2pDynamicExample example);

    List<Map> selectByAvgInterestRate(P2pDynamicExample example);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_dynamic
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    P2pDynamic selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_dynamic
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") P2pDynamic record, @Param("example") P2pDynamicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_dynamic
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") P2pDynamic record, @Param("example") P2pDynamicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_dynamic
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(P2pDynamic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_dynamic
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(P2pDynamic record);
}