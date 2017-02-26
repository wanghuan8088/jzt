package com.jzt.api.dao;

import com.jzt.api.domain.HotNewsApproval;
import com.jzt.api.domain.HotNewsApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotNewsApprovalMapper {
    int countByExample(HotNewsApprovalExample example);

    int deleteByExample(HotNewsApprovalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotNewsApproval record);

    int insertSelective(HotNewsApproval record);

    List<HotNewsApproval> selectByExample(HotNewsApprovalExample example);

    HotNewsApproval selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HotNewsApproval record, @Param("example") HotNewsApprovalExample example);

    int updateByExample(@Param("record") HotNewsApproval record, @Param("example") HotNewsApprovalExample example);

    int updateByPrimaryKeySelective(HotNewsApproval record);

    int updateByPrimaryKey(HotNewsApproval record);
}