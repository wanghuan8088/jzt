package com.jzt.api.dao;

import com.jzt.api.domain.HotNewsApproval;
import com.jzt.api.domain.HotNewsApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotNewsApprovalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_news_approval
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(HotNewsApprovalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_news_approval
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(HotNewsApprovalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_news_approval
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_news_approval
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(HotNewsApproval record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_news_approval
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(HotNewsApproval record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_news_approval
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<HotNewsApproval> selectByExample(HotNewsApprovalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_news_approval
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    HotNewsApproval selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_news_approval
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") HotNewsApproval record, @Param("example") HotNewsApprovalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_news_approval
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") HotNewsApproval record, @Param("example") HotNewsApprovalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_news_approval
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(HotNewsApproval record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_news_approval
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(HotNewsApproval record);
}