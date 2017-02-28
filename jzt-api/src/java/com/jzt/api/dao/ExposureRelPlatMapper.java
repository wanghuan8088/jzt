package com.jzt.api.dao;

import com.jzt.api.domain.ExposureRelPlat;
import com.jzt.api.domain.ExposureRelPlatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExposureRelPlatMapper {
    int countByExample(ExposureRelPlatExample example);

    int deleteByExample(ExposureRelPlatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExposureRelPlat record);

    int insertSelective(ExposureRelPlat record);

    List<ExposureRelPlat> selectByExample(ExposureRelPlatExample example);

    ExposureRelPlat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExposureRelPlat record, @Param("example") ExposureRelPlatExample example);

    int updateByExample(@Param("record") ExposureRelPlat record, @Param("example") ExposureRelPlatExample example);

    int updateByPrimaryKeySelective(ExposureRelPlat record);

    int updateByPrimaryKey(ExposureRelPlat record);
}