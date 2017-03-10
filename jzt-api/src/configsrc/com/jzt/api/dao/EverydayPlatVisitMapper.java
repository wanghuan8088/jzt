package com.jzt.api.dao;

import com.jzt.api.domain.EverydayPlatVisit;
import com.jzt.api.domain.EverydayPlatVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EverydayPlatVisitMapper {
    int countByExample(EverydayPlatVisitExample example);

    int deleteByExample(EverydayPlatVisitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EverydayPlatVisit record);

    int insertSelective(EverydayPlatVisit record);

    List<EverydayPlatVisit> selectByExample(EverydayPlatVisitExample example);

    EverydayPlatVisit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EverydayPlatVisit record, @Param("example") EverydayPlatVisitExample example);

    int updateByExample(@Param("record") EverydayPlatVisit record, @Param("example") EverydayPlatVisitExample example);

    int updateByPrimaryKeySelective(EverydayPlatVisit record);

    int updateByPrimaryKey(EverydayPlatVisit record);
}