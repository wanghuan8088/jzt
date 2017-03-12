package com.jzt.api.dao;

import com.jzt.api.domain.ReportFile;
import com.jzt.api.domain.ReportFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_file
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int countByExample(ReportFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_file
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByExample(ReportFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_file
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_file
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insert(ReportFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_file
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int insertSelective(ReportFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_file
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    List<ReportFile> selectByExample(ReportFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_file
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    ReportFile selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_file
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExampleSelective(@Param("record") ReportFile record, @Param("example") ReportFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_file
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByExample(@Param("record") ReportFile record, @Param("example") ReportFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_file
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKeySelective(ReportFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_file
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    int updateByPrimaryKey(ReportFile record);
}