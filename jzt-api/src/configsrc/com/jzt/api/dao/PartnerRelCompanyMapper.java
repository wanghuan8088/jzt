package com.jzt.api.dao;

import com.jzt.api.domain.PartnerRelCompany;
import com.jzt.api.domain.PartnerRelCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartnerRelCompanyMapper {
    int countByExample(PartnerRelCompanyExample example);

    int deleteByExample(PartnerRelCompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartnerRelCompany record);

    int insertSelective(PartnerRelCompany record);

    List<PartnerRelCompany> selectByExample(PartnerRelCompanyExample example);

    PartnerRelCompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartnerRelCompany record, @Param("example") PartnerRelCompanyExample example);

    int updateByExample(@Param("record") PartnerRelCompany record, @Param("example") PartnerRelCompanyExample example);

    int updateByPrimaryKeySelective(PartnerRelCompany record);

    int updateByPrimaryKey(PartnerRelCompany record);
}