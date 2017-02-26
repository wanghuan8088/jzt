package com.jzt.api.dao;

import com.jzt.api.domain.Platform;
import com.jzt.api.domain.PlatformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatformMapper {
    int countByExample(PlatformExample example);

    int deleteByExample(PlatformExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Platform record);

    int insertSelective(Platform record);

    List<Platform> selectByExample(PlatformExample example);

    Platform selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Platform record, @Param("example") PlatformExample example);

    int updateByExample(@Param("record") Platform record, @Param("example") PlatformExample example);

    int updateByPrimaryKeySelective(Platform record);

    int updateByPrimaryKey(Platform record);
}