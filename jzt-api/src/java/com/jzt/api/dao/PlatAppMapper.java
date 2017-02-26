package com.jzt.api.dao;

import com.jzt.api.domain.PlatApp;
import com.jzt.api.domain.PlatAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatAppMapper {
    int countByExample(PlatAppExample example);

    int deleteByExample(PlatAppExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlatApp record);

    int insertSelective(PlatApp record);

    List<PlatApp> selectByExample(PlatAppExample example);

    PlatApp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlatApp record, @Param("example") PlatAppExample example);

    int updateByExample(@Param("record") PlatApp record, @Param("example") PlatAppExample example);

    int updateByPrimaryKeySelective(PlatApp record);

    int updateByPrimaryKey(PlatApp record);
}