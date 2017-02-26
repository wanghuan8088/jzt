package com.jzt.api.dao;

import com.jzt.api.domain.CompanyStructure;
import com.jzt.api.domain.CompanyStructureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyStructureMapper {
    int countByExample(CompanyStructureExample example);

    int deleteByExample(CompanyStructureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyStructure record);

    int insertSelective(CompanyStructure record);

    List<CompanyStructure> selectByExampleWithBLOBs(CompanyStructureExample example);

    List<CompanyStructure> selectByExample(CompanyStructureExample example);

    CompanyStructure selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyStructure record, @Param("example") CompanyStructureExample example);

    int updateByExampleWithBLOBs(@Param("record") CompanyStructure record, @Param("example") CompanyStructureExample example);

    int updateByExample(@Param("record") CompanyStructure record, @Param("example") CompanyStructureExample example);

    int updateByPrimaryKeySelective(CompanyStructure record);

    int updateByPrimaryKeyWithBLOBs(CompanyStructure record);

    int updateByPrimaryKey(CompanyStructure record);
}