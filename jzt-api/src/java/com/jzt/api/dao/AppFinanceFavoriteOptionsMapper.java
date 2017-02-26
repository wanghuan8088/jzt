package com.jzt.api.dao;

import com.jzt.api.domain.AppFinanceFavoriteOptions;
import com.jzt.api.domain.AppFinanceFavoriteOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppFinanceFavoriteOptionsMapper {
    int countByExample(AppFinanceFavoriteOptionsExample example);

    int deleteByExample(AppFinanceFavoriteOptionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppFinanceFavoriteOptions record);

    int insertSelective(AppFinanceFavoriteOptions record);

    List<AppFinanceFavoriteOptions> selectByExample(AppFinanceFavoriteOptionsExample example);

    AppFinanceFavoriteOptions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppFinanceFavoriteOptions record, @Param("example") AppFinanceFavoriteOptionsExample example);

    int updateByExample(@Param("record") AppFinanceFavoriteOptions record, @Param("example") AppFinanceFavoriteOptionsExample example);

    int updateByPrimaryKeySelective(AppFinanceFavoriteOptions record);

    int updateByPrimaryKey(AppFinanceFavoriteOptions record);
}