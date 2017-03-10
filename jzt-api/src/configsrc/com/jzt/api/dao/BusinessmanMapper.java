package com.jzt.api.dao;

import com.jzt.api.domain.Businessman;
import com.jzt.api.domain.BusinessmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessmanMapper {
    int countByExample(BusinessmanExample example);

    int deleteByExample(BusinessmanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Businessman record);

    int insertSelective(Businessman record);

    List<Businessman> selectByExampleWithBLOBs(BusinessmanExample example);

    List<Businessman> selectByExample(BusinessmanExample example);

    Businessman selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Businessman record, @Param("example") BusinessmanExample example);

    int updateByExampleWithBLOBs(@Param("record") Businessman record, @Param("example") BusinessmanExample example);

    int updateByExample(@Param("record") Businessman record, @Param("example") BusinessmanExample example);

    int updateByPrimaryKeySelective(Businessman record);

    int updateByPrimaryKeyWithBLOBs(Businessman record);

    int updateByPrimaryKey(Businessman record);
}