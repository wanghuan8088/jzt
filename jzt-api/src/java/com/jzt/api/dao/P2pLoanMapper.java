package com.jzt.api.dao;

import com.jzt.api.domain.P2pLoan;
import com.jzt.api.domain.P2pLoanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface P2pLoanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(P2pLoanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(P2pLoanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(P2pLoan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(P2pLoan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<P2pLoan> selectByExampleWithBLOBs(P2pLoanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<P2pLoan> selectByExample(P2pLoanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    P2pLoan selectByPrimaryKey(Integer id);

    Map selectMapByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") P2pLoan record, @Param("example") P2pLoanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") P2pLoan record, @Param("example") P2pLoanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") P2pLoan record, @Param("example") P2pLoanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(P2pLoan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(P2pLoan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p2p_loan
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(P2pLoan record);
    
    List<P2pLoan> selectByUserId(@Param("uId")Integer uId, @Param("startRow")Integer startRow, @Param("pageSize")Integer pageSize);

    int removeByPrimaryKey(P2pLoan record);

    /**
     * @author hjw
     * @param example
     * @return 返回带有平台信息的标的列表
     */
    List<Map> listByExample(P2pLoanExample example);

    /**
     * @author hjw
     * @param id
     * @return 返回带有平台名称的标的
     */
    Map selectByPrimaryKeyWithPlatformName(Integer id);
}