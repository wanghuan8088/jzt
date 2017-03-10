package com.jzt.api.dao;

import com.jzt.api.domain.P2pPlat;
import com.jzt.api.domain.P2pPlatExample;
import com.jzt.api.domain.P2pPlatWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface P2pPlatMapper {
    int countByExample(P2pPlatExample example);

    int deleteByExample(P2pPlatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pPlatWithBLOBs record);

    int insertSelective(P2pPlatWithBLOBs record);

    List<P2pPlatWithBLOBs> selectByExampleWithBLOBs(P2pPlatExample example);

    List<P2pPlat> selectByExample(P2pPlatExample example);

    P2pPlatWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pPlatWithBLOBs record, @Param("example") P2pPlatExample example);

    int updateByExampleWithBLOBs(@Param("record") P2pPlatWithBLOBs record, @Param("example") P2pPlatExample example);

    int updateByExample(@Param("record") P2pPlat record, @Param("example") P2pPlatExample example);

    int updateByPrimaryKeySelective(P2pPlatWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(P2pPlatWithBLOBs record);

    int updateByPrimaryKey(P2pPlat record);
}