package com.jzt.api.dao;

import com.jzt.api.domain.AppUserFavorite;
import com.jzt.api.domain.AppUserFavoriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppUserFavoriteMapper {
    int countByExample(AppUserFavoriteExample example);

    int deleteByExample(AppUserFavoriteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppUserFavorite record);

    int insertSelective(AppUserFavorite record);

    List<AppUserFavorite> selectByExample(AppUserFavoriteExample example);

    AppUserFavorite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppUserFavorite record, @Param("example") AppUserFavoriteExample example);

    int updateByExample(@Param("record") AppUserFavorite record, @Param("example") AppUserFavoriteExample example);

    int updateByPrimaryKeySelective(AppUserFavorite record);

    int updateByPrimaryKey(AppUserFavorite record);

    List<AppUserFavorite> selectByUserId(String userId);
}