package com.jzt.api.dao;

import com.jzt.api.domain.BankEval;
import com.jzt.api.domain.BankEvalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankEvalMapper {
    int countByExample(BankEvalExample example);

    int deleteByExample(BankEvalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BankEval record);

    int insertSelective(BankEval record);

    List<BankEval> selectByExample(BankEvalExample example);

    BankEval selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BankEval record, @Param("example") BankEvalExample example);

    int updateByExample(@Param("record") BankEval record, @Param("example") BankEvalExample example);

    int updateByPrimaryKeySelective(BankEval record);

    int updateByPrimaryKey(BankEval record);
}