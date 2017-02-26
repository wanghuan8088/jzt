package com.jzt.api.dao;

import com.jzt.api.domain.FinanceAssociation;
import com.jzt.api.domain.FinanceAssociationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceAssociationMapper {
    int countByExample(FinanceAssociationExample example);

    int deleteByExample(FinanceAssociationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FinanceAssociation record);

    int insertSelective(FinanceAssociation record);

    List<FinanceAssociation> selectByExample(FinanceAssociationExample example);

    FinanceAssociation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FinanceAssociation record, @Param("example") FinanceAssociationExample example);

    int updateByExample(@Param("record") FinanceAssociation record, @Param("example") FinanceAssociationExample example);

    int updateByPrimaryKeySelective(FinanceAssociation record);

    int updateByPrimaryKey(FinanceAssociation record);
}