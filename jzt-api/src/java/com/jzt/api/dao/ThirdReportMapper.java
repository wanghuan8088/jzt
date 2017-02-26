package com.jzt.api.dao;

import com.jzt.api.domain.ThirdReport;
import com.jzt.api.domain.ThirdReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThirdReportMapper {
    int countByExample(ThirdReportExample example);

    int deleteByExample(ThirdReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThirdReport record);

    int insertSelective(ThirdReport record);

    List<ThirdReport> selectByExample(ThirdReportExample example);

    ThirdReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThirdReport record, @Param("example") ThirdReportExample example);

    int updateByExample(@Param("record") ThirdReport record, @Param("example") ThirdReportExample example);

    int updateByPrimaryKeySelective(ThirdReport record);

    int updateByPrimaryKey(ThirdReport record);
}