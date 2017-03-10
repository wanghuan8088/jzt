package com.jzt.api.dao;

import com.jzt.api.domain.PlatState;
import com.jzt.api.domain.PlatStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatStateMapper {
    int countByExample(PlatStateExample example);

    int deleteByExample(PlatStateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlatState record);

    int insertSelective(PlatState record);

    List<PlatState> selectByExample(PlatStateExample example);

    PlatState selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlatState record, @Param("example") PlatStateExample example);

    int updateByExample(@Param("record") PlatState record, @Param("example") PlatStateExample example);

    int updateByPrimaryKeySelective(PlatState record);

    int updateByPrimaryKey(PlatState record);
}