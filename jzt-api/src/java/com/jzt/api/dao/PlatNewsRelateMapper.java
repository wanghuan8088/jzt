package com.jzt.api.dao;

import com.jzt.api.domain.PlatNewsRelate;
import com.jzt.api.domain.PlatNewsRelateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatNewsRelateMapper {
    int countByExample(PlatNewsRelateExample example);

    int deleteByExample(PlatNewsRelateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlatNewsRelate record);

    int insertSelective(PlatNewsRelate record);

    List<PlatNewsRelate> selectByExample(PlatNewsRelateExample example);

    PlatNewsRelate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlatNewsRelate record, @Param("example") PlatNewsRelateExample example);

    int updateByExample(@Param("record") PlatNewsRelate record, @Param("example") PlatNewsRelateExample example);

    int updateByPrimaryKeySelective(PlatNewsRelate record);

    int updateByPrimaryKey(PlatNewsRelate record);
}