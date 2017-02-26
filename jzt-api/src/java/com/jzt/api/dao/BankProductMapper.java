package com.jzt.api.dao;

import com.jzt.api.domain.BankProduct;
import com.jzt.api.domain.BankProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankProductMapper {
    int countByExample(BankProductExample example);

    int deleteByExample(BankProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BankProduct record);

    int insertSelective(BankProduct record);

    List<BankProduct> selectByExample(BankProductExample example);

    BankProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BankProduct record, @Param("example") BankProductExample example);

    int updateByExample(@Param("record") BankProduct record, @Param("example") BankProductExample example);

    int updateByPrimaryKeySelective(BankProduct record);

    int updateByPrimaryKey(BankProduct record);
}