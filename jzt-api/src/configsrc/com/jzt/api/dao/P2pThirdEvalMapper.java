package com.jzt.api.dao;

import com.jzt.api.domain.P2pThirdEval;
import com.jzt.api.domain.P2pThirdEvalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface P2pThirdEvalMapper {
    int countByExample(P2pThirdEvalExample example);

    int deleteByExample(P2pThirdEvalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(P2pThirdEval record);

    int insertSelective(P2pThirdEval record);

    List<P2pThirdEval> selectByExample(P2pThirdEvalExample example);

    P2pThirdEval selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") P2pThirdEval record, @Param("example") P2pThirdEvalExample example);

    int updateByExample(@Param("record") P2pThirdEval record, @Param("example") P2pThirdEvalExample example);

    int updateByPrimaryKeySelective(P2pThirdEval record);

    int updateByPrimaryKey(P2pThirdEval record);
}