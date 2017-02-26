package com.jzt.api.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.jzt.api.domain.TUser;
import com.jzt.api.domain.TUserExample;

/**
 * 功能概要：UserService接口类
 * 
 * @author Kavin
 * @since  2016年4月11日 
 */
public interface UserService {
    int countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    TUser selectByPrimaryKey(Integer id);
    
    List<TUser> selectFriendByPhone(TUser record);
    
    List<TUser> selectMyFriendByUserId(TUser record);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

	Map<String, Object> selectUserByReferrerPhone(TUser record);

}
