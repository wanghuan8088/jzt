package com.jzt.api.dao;

import com.jzt.api.domain.UserAttentionPlatform;
import com.jzt.api.domain.UserAttentionPlatformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAttentionPlatformMapper {
    int countByExample(UserAttentionPlatformExample example);

    int deleteByExample(UserAttentionPlatformExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserAttentionPlatform record);

    int insertSelective(UserAttentionPlatform record);

    List<UserAttentionPlatform> selectByExample(UserAttentionPlatformExample example);

    UserAttentionPlatform selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserAttentionPlatform record, @Param("example") UserAttentionPlatformExample example);

    int updateByExample(@Param("record") UserAttentionPlatform record, @Param("example") UserAttentionPlatformExample example);

    int updateByPrimaryKeySelective(UserAttentionPlatform record);

    int updateByPrimaryKey(UserAttentionPlatform record);
}