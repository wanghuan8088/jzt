package com.jzt.api.dao;

import com.jzt.api.domain.ReportFile;
import com.jzt.api.domain.ReportFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportFileMapper {
    int countByExample(ReportFileExample example);

    int deleteByExample(ReportFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReportFile record);

    int insertSelective(ReportFile record);

    List<ReportFile> selectByExample(ReportFileExample example);

    ReportFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReportFile record, @Param("example") ReportFileExample example);

    int updateByExample(@Param("record") ReportFile record, @Param("example") ReportFileExample example);

    int updateByPrimaryKeySelective(ReportFile record);

    int updateByPrimaryKey(ReportFile record);
}