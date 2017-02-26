package com.jzt.api.dao;

import com.jzt.api.domain.UserAttentionProduct;
import com.jzt.api.domain.UserAttentionProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAttentionProductMapper {
    int countByExample(UserAttentionProductExample example);

    int deleteByExample(UserAttentionProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserAttentionProduct record);

    int insertSelective(UserAttentionProduct record);

    List<UserAttentionProduct> selectByExample(UserAttentionProductExample example);

    UserAttentionProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserAttentionProduct record, @Param("example") UserAttentionProductExample example);

    int updateByExample(@Param("record") UserAttentionProduct record, @Param("example") UserAttentionProductExample example);

    int updateByPrimaryKeySelective(UserAttentionProduct record);

    int updateByPrimaryKey(UserAttentionProduct record);
}