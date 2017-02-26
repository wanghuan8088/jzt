package com.jzt.api.dao;

import com.jzt.api.domain.Company;
import com.jzt.api.domain.CompanyExample;
import com.jzt.api.domain.CompanyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    int countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyWithBLOBs record);

    int insertSelective(CompanyWithBLOBs record);

    List<CompanyWithBLOBs> selectByExampleWithBLOBs(CompanyExample example);

    List<Company> selectByExample(CompanyExample example);

    CompanyWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyWithBLOBs record, @Param("example") CompanyExample example);

    int updateByExampleWithBLOBs(@Param("record") CompanyWithBLOBs record, @Param("example") CompanyExample example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByPrimaryKeySelective(CompanyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CompanyWithBLOBs record);

    int updateByPrimaryKey(Company record);
}