package com.jzt.api.dao;

import com.jzt.api.domain.ExposureImage;
import com.jzt.api.domain.ExposureImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExposureImageMapper {
    int countByExample(ExposureImageExample example);

    int deleteByExample(ExposureImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExposureImage record);

    int insertSelective(ExposureImage record);

    List<ExposureImage> selectByExample(ExposureImageExample example);

    ExposureImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExposureImage record, @Param("example") ExposureImageExample example);

    int updateByExample(@Param("record") ExposureImage record, @Param("example") ExposureImageExample example);

    int updateByPrimaryKeySelective(ExposureImage record);

    int updateByPrimaryKey(ExposureImage record);
}