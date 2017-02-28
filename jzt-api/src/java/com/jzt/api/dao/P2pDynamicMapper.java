package com.jzt.api.dao;

import com.jzt.api.domain.P2pDynamic;
import com.jzt.api.domain.P2pDynamicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface P2pDynamicMapper {
    int countByExample(P2pDynamicExample example);

    int deleteByExample(P2pDynamicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pDynamic record);

    int insertSelective(P2pDynamic record);

    List<P2pDynamic> selectByExample(P2pDynamicExample example);

    P2pDynamic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pDynamic record, @Param("example") P2pDynamicExample example);

    int updateByExample(@Param("record") P2pDynamic record, @Param("example") P2pDynamicExample example);

    int updateByPrimaryKeySelective(P2pDynamic record);

    int updateByPrimaryKey(P2pDynamic record);
}