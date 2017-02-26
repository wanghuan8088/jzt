package com.jzt.api.dao;

import com.jzt.api.domain.PartnerRelProduct;
import com.jzt.api.domain.PartnerRelProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartnerRelProductMapper {
    int countByExample(PartnerRelProductExample example);

    int deleteByExample(PartnerRelProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartnerRelProduct record);

    int insertSelective(PartnerRelProduct record);

    List<PartnerRelProduct> selectByExample(PartnerRelProductExample example);

    PartnerRelProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartnerRelProduct record, @Param("example") PartnerRelProductExample example);

    int updateByExample(@Param("record") PartnerRelProduct record, @Param("example") PartnerRelProductExample example);

    int updateByPrimaryKeySelective(PartnerRelProduct record);

    int updateByPrimaryKey(PartnerRelProduct record);
}