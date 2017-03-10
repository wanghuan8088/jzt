package com.jzt.api.dao;

import com.jzt.api.domain.EverymonthPlatVisit;
import com.jzt.api.domain.EverymonthPlatVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EverymonthPlatVisitMapper {
    int countByExample(EverymonthPlatVisitExample example);

    int deleteByExample(EverymonthPlatVisitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EverymonthPlatVisit record);

    int insertSelective(EverymonthPlatVisit record);

    List<EverymonthPlatVisit> selectByExample(EverymonthPlatVisitExample example);

    EverymonthPlatVisit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EverymonthPlatVisit record, @Param("example") EverymonthPlatVisitExample example);

    int updateByExample(@Param("record") EverymonthPlatVisit record, @Param("example") EverymonthPlatVisitExample example);

    int updateByPrimaryKeySelective(EverymonthPlatVisit record);

    int updateByPrimaryKey(EverymonthPlatVisit record);
}