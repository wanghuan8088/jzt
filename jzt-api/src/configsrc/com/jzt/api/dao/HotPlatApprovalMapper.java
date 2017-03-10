package com.jzt.api.dao;

import com.jzt.api.domain.HotPlatApproval;
import com.jzt.api.domain.HotPlatApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotPlatApprovalMapper {
    int countByExample(HotPlatApprovalExample example);

    int deleteByExample(HotPlatApprovalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotPlatApproval record);

    int insertSelective(HotPlatApproval record);

    List<HotPlatApproval> selectByExample(HotPlatApprovalExample example);

    HotPlatApproval selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HotPlatApproval record, @Param("example") HotPlatApprovalExample example);

    int updateByExample(@Param("record") HotPlatApproval record, @Param("example") HotPlatApprovalExample example);

    int updateByPrimaryKeySelective(HotPlatApproval record);

    int updateByPrimaryKey(HotPlatApproval record);
}