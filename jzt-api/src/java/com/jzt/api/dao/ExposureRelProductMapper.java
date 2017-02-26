package com.jzt.api.dao;

import com.jzt.api.domain.ExposureRelProduct;
import com.jzt.api.domain.ExposureRelProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExposureRelProductMapper {
    int countByExample(ExposureRelProductExample example);

    int deleteByExample(ExposureRelProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExposureRelProduct record);

    int insertSelective(ExposureRelProduct record);

    List<ExposureRelProduct> selectByExample(ExposureRelProductExample example);

    ExposureRelProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExposureRelProduct record, @Param("example") ExposureRelProductExample example);

    int updateByExample(@Param("record") ExposureRelProduct record, @Param("example") ExposureRelProductExample example);

    int updateByPrimaryKeySelective(ExposureRelProduct record);

    int updateByPrimaryKey(ExposureRelProduct record);
}