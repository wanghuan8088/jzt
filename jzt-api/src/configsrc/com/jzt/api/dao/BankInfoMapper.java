package com.jzt.api.dao;

import com.jzt.api.domain.BankInfo;
import com.jzt.api.domain.BankInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankInfoMapper {
    int countByExample(BankInfoExample example);

    int deleteByExample(BankInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BankInfo record);

    int insertSelective(BankInfo record);

    List<BankInfo> selectByExample(BankInfoExample example);

    BankInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BankInfo record, @Param("example") BankInfoExample example);

    int updateByExample(@Param("record") BankInfo record, @Param("example") BankInfoExample example);

    int updateByPrimaryKeySelective(BankInfo record);

    int updateByPrimaryKey(BankInfo record);
}