package com.jzt.api.dao;

import com.jzt.api.domain.ExposureUserAgree;
import com.jzt.api.domain.ExposureUserAgreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExposureUserAgreeMapper {
    int countByExample(ExposureUserAgreeExample example);

    int deleteByExample(ExposureUserAgreeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExposureUserAgree record);

    int insertSelective(ExposureUserAgree record);

    List<ExposureUserAgree> selectByExample(ExposureUserAgreeExample example);

    ExposureUserAgree selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExposureUserAgree record, @Param("example") ExposureUserAgreeExample example);

    int updateByExample(@Param("record") ExposureUserAgree record, @Param("example") ExposureUserAgreeExample example);

    int updateByPrimaryKeySelective(ExposureUserAgree record);

    int updateByPrimaryKey(ExposureUserAgree record);
}