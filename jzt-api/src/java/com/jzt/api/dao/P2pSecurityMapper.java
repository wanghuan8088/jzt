package com.jzt.api.dao;

import com.jzt.api.domain.P2pSecurity;
import com.jzt.api.domain.P2pSecurityExample;
import com.jzt.api.domain.P2pSecurityWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface P2pSecurityMapper {
    int countByExample(P2pSecurityExample example);

    int deleteByExample(P2pSecurityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pSecurityWithBLOBs record);

    int insertSelective(P2pSecurityWithBLOBs record);

    List<P2pSecurityWithBLOBs> selectByExampleWithBLOBs(P2pSecurityExample example);

    List<P2pSecurity> selectByExample(P2pSecurityExample example);

    P2pSecurityWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pSecurityWithBLOBs record, @Param("example") P2pSecurityExample example);

    int updateByExampleWithBLOBs(@Param("record") P2pSecurityWithBLOBs record, @Param("example") P2pSecurityExample example);

    int updateByExample(@Param("record") P2pSecurity record, @Param("example") P2pSecurityExample example);

    int updateByPrimaryKeySelective(P2pSecurityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(P2pSecurityWithBLOBs record);

    int updateByPrimaryKey(P2pSecurity record);
}