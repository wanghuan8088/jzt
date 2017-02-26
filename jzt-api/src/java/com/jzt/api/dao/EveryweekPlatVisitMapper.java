package com.jzt.api.dao;

import com.jzt.api.domain.EveryweekPlatVisit;
import com.jzt.api.domain.EveryweekPlatVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EveryweekPlatVisitMapper {
    int countByExample(EveryweekPlatVisitExample example);

    int deleteByExample(EveryweekPlatVisitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EveryweekPlatVisit record);

    int insertSelective(EveryweekPlatVisit record);

    List<EveryweekPlatVisit> selectByExample(EveryweekPlatVisitExample example);

    EveryweekPlatVisit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EveryweekPlatVisit record, @Param("example") EveryweekPlatVisitExample example);

    int updateByExample(@Param("record") EveryweekPlatVisit record, @Param("example") EveryweekPlatVisitExample example);

    int updateByPrimaryKeySelective(EveryweekPlatVisit record);

    int updateByPrimaryKey(EveryweekPlatVisit record);
}