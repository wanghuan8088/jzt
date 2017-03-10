package com.jzt.api.dao;

import com.jzt.api.domain.AppFinanceFavorite;
import com.jzt.api.domain.AppFinanceFavoriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppFinanceFavoriteMapper {
    int countByExample(AppFinanceFavoriteExample example);

    int deleteByExample(AppFinanceFavoriteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppFinanceFavorite record);

    int insertSelective(AppFinanceFavorite record);

    List<AppFinanceFavorite> selectByExample(AppFinanceFavoriteExample example);

    AppFinanceFavorite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppFinanceFavorite record, @Param("example") AppFinanceFavoriteExample example);

    int updateByExample(@Param("record") AppFinanceFavorite record, @Param("example") AppFinanceFavoriteExample example);

    int updateByPrimaryKeySelective(AppFinanceFavorite record);

    int updateByPrimaryKey(AppFinanceFavorite record);
}