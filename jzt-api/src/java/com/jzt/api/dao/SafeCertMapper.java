package com.jzt.api.dao;

import com.jzt.api.domain.SafeCert;
import com.jzt.api.domain.SafeCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SafeCertMapper {
    int countByExample(SafeCertExample example);

    int deleteByExample(SafeCertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SafeCert record);

    int insertSelective(SafeCert record);

    List<SafeCert> selectByExample(SafeCertExample example);

    SafeCert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SafeCert record, @Param("example") SafeCertExample example);

    int updateByExample(@Param("record") SafeCert record, @Param("example") SafeCertExample example);

    int updateByPrimaryKeySelective(SafeCert record);

    int updateByPrimaryKey(SafeCert record);
}