package com.jzt.api.dao;

import com.jzt.api.domain.AppUserFinanceFavorite;
import com.jzt.api.domain.AppUserFinanceFavoriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppUserFinanceFavoriteMapper {
    int countByExample(AppUserFinanceFavoriteExample example);

    int deleteByExample(AppUserFinanceFavoriteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppUserFinanceFavorite record);

    int insertSelective(AppUserFinanceFavorite record);

    List<AppUserFinanceFavorite> selectByExample(AppUserFinanceFavoriteExample example);

    AppUserFinanceFavorite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppUserFinanceFavorite record, @Param("example") AppUserFinanceFavoriteExample example);

    int updateByExample(@Param("record") AppUserFinanceFavorite record, @Param("example") AppUserFinanceFavoriteExample example);

    int updateByPrimaryKeySelective(AppUserFinanceFavorite record);

    int updateByPrimaryKey(AppUserFinanceFavorite record);
}