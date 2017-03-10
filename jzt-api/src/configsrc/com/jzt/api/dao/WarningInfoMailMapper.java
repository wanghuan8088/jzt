package com.jzt.api.dao;

import com.jzt.api.domain.WarningInfoMail;
import com.jzt.api.domain.WarningInfoMailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarningInfoMailMapper {
    int countByExample(WarningInfoMailExample example);

    int deleteByExample(WarningInfoMailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WarningInfoMail record);

    int insertSelective(WarningInfoMail record);

    List<WarningInfoMail> selectByExample(WarningInfoMailExample example);

    WarningInfoMail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WarningInfoMail record, @Param("example") WarningInfoMailExample example);

    int updateByExample(@Param("record") WarningInfoMail record, @Param("example") WarningInfoMailExample example);

    int updateByPrimaryKeySelective(WarningInfoMail record);

    int updateByPrimaryKey(WarningInfoMail record);
}