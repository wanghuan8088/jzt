package com.jzt.api.dao;

import com.jzt.api.domain.Exposure;
import com.jzt.api.domain.ExposureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExposureMapper {
    int countByExample(ExposureExample example);

    int deleteByExample(ExposureExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(Exposure record);

    int insertSelective(Exposure record);

    List<Exposure> selectByExampleWithBLOBs(ExposureExample example);

    List<Exposure> selectByExample(ExposureExample example);

    Exposure selectByPrimaryKey(Integer eid);

    int updateByExampleSelective(@Param("record") Exposure record, @Param("example") ExposureExample example);

    int updateByExampleWithBLOBs(@Param("record") Exposure record, @Param("example") ExposureExample example);

    int updateByExample(@Param("record") Exposure record, @Param("example") ExposureExample example);

    int updateByPrimaryKeySelective(Exposure record);

    int updateByPrimaryKeyWithBLOBs(Exposure record);

    int updateByPrimaryKey(Exposure record);
}