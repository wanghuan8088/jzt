package com.jzt.api.dao;

import com.jzt.api.domain.NewsApproval;
import com.jzt.api.domain.NewsApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsApprovalMapper {
    int countByExample(NewsApprovalExample example);

    int deleteByExample(NewsApprovalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsApproval record);

    int insertSelective(NewsApproval record);

    List<NewsApproval> selectByExample(NewsApprovalExample example);

    NewsApproval selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewsApproval record, @Param("example") NewsApprovalExample example);

    int updateByExample(@Param("record") NewsApproval record, @Param("example") NewsApprovalExample example);

    int updateByPrimaryKeySelective(NewsApproval record);

    int updateByPrimaryKey(NewsApproval record);
}