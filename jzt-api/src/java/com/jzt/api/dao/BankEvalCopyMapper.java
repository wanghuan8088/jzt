package com.jzt.api.dao;

import com.jzt.api.domain.BankEvalCopy;
import com.jzt.api.domain.BankEvalCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankEvalCopyMapper {
    int countByExample(BankEvalCopyExample example);

    int deleteByExample(BankEvalCopyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BankEvalCopy record);

    int insertSelective(BankEvalCopy record);

    List<BankEvalCopy> selectByExample(BankEvalCopyExample example);

    BankEvalCopy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BankEvalCopy record, @Param("example") BankEvalCopyExample example);

    int updateByExample(@Param("record") BankEvalCopy record, @Param("example") BankEvalCopyExample example);

    int updateByPrimaryKeySelective(BankEvalCopy record);

    int updateByPrimaryKey(BankEvalCopy record);
}