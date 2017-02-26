package com.jzt.api.dao;

import com.jzt.api.domain.SecurityP2p;
import com.jzt.api.domain.SecurityP2pExample;
import com.jzt.api.domain.SecurityP2pWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecurityP2pMapper {
    int countByExample(SecurityP2pExample example);

    int deleteByExample(SecurityP2pExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecurityP2pWithBLOBs record);

    int insertSelective(SecurityP2pWithBLOBs record);

    List<SecurityP2pWithBLOBs> selectByExampleWithBLOBs(SecurityP2pExample example);

    List<SecurityP2p> selectByExample(SecurityP2pExample example);

    SecurityP2pWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecurityP2pWithBLOBs record, @Param("example") SecurityP2pExample example);

    int updateByExampleWithBLOBs(@Param("record") SecurityP2pWithBLOBs record, @Param("example") SecurityP2pExample example);

    int updateByExample(@Param("record") SecurityP2p record, @Param("example") SecurityP2pExample example);

    int updateByPrimaryKeySelective(SecurityP2pWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SecurityP2pWithBLOBs record);

    int updateByPrimaryKey(SecurityP2p record);
}