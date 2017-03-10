package com.jzt.api.dao;

import com.jzt.api.domain.PlatWeb;
import com.jzt.api.domain.PlatWebExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatWebMapper {
    int countByExample(PlatWebExample example);

    int deleteByExample(PlatWebExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlatWeb record);

    int insertSelective(PlatWeb record);

    List<PlatWeb> selectByExampleWithBLOBs(PlatWebExample example);

    List<PlatWeb> selectByExample(PlatWebExample example);

    PlatWeb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlatWeb record, @Param("example") PlatWebExample example);

    int updateByExampleWithBLOBs(@Param("record") PlatWeb record, @Param("example") PlatWebExample example);

    int updateByExample(@Param("record") PlatWeb record, @Param("example") PlatWebExample example);

    int updateByPrimaryKeySelective(PlatWeb record);

    int updateByPrimaryKeyWithBLOBs(PlatWeb record);

    int updateByPrimaryKey(PlatWeb record);
}