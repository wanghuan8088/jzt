package com.jzt.api.dao;

import com.jzt.api.domain.P2pTrend;
import com.jzt.api.domain.P2pTrendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface P2pTrendMapper {
    int countByExample(P2pTrendExample example);

    int deleteByExample(P2pTrendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pTrend record);

    int insertSelective(P2pTrend record);

    List<P2pTrend> selectByExample(P2pTrendExample example);

    P2pTrend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pTrend record, @Param("example") P2pTrendExample example);

    int updateByExample(@Param("record") P2pTrend record, @Param("example") P2pTrendExample example);

    int updateByPrimaryKeySelective(P2pTrend record);

    int updateByPrimaryKey(P2pTrend record);
}