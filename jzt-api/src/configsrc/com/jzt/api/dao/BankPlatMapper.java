package com.jzt.api.dao;

import com.jzt.api.domain.BankPlat;
import com.jzt.api.domain.BankPlatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankPlatMapper {
    int countByExample(BankPlatExample example);

    int deleteByExample(BankPlatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BankPlat record);

    int insertSelective(BankPlat record);

    List<BankPlat> selectByExample(BankPlatExample example);

    BankPlat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BankPlat record, @Param("example") BankPlatExample example);

    int updateByExample(@Param("record") BankPlat record, @Param("example") BankPlatExample example);

    int updateByPrimaryKeySelective(BankPlat record);

    int updateByPrimaryKey(BankPlat record);
}