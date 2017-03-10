package com.jzt.api.dao;

import com.jzt.api.domain.PlatContact;
import com.jzt.api.domain.PlatContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatContactMapper {
    int countByExample(PlatContactExample example);

    int deleteByExample(PlatContactExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlatContact record);

    int insertSelective(PlatContact record);

    List<PlatContact> selectByExample(PlatContactExample example);

    PlatContact selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlatContact record, @Param("example") PlatContactExample example);

    int updateByExample(@Param("record") PlatContact record, @Param("example") PlatContactExample example);

    int updateByPrimaryKeySelective(PlatContact record);

    int updateByPrimaryKey(PlatContact record);
}