package com.jzt.api.dao;

import com.jzt.api.domain.HotProductApproval;
import com.jzt.api.domain.HotProductApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotProductApprovalMapper {
    int countByExample(HotProductApprovalExample example);

    int deleteByExample(HotProductApprovalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotProductApproval record);

    int insertSelective(HotProductApproval record);

    List<HotProductApproval> selectByExample(HotProductApprovalExample example);

    HotProductApproval selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HotProductApproval record, @Param("example") HotProductApprovalExample example);

    int updateByExample(@Param("record") HotProductApproval record, @Param("example") HotProductApprovalExample example);

    int updateByPrimaryKeySelective(HotProductApproval record);

    int updateByPrimaryKey(HotProductApproval record);
}