package com.jzt.api.dao;

import com.jzt.api.domain.AppKeywordsTrend;
import com.jzt.api.domain.AppKeywordsTrendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppKeywordsTrendMapper {
    int countByExample(AppKeywordsTrendExample example);

    int deleteByExample(AppKeywordsTrendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppKeywordsTrend record);

    int insertSelective(AppKeywordsTrend record);

    List<AppKeywordsTrend> selectByExample(AppKeywordsTrendExample example);

    AppKeywordsTrend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppKeywordsTrend record, @Param("example") AppKeywordsTrendExample example);

    int updateByExample(@Param("record") AppKeywordsTrend record, @Param("example") AppKeywordsTrendExample example);

    int updateByPrimaryKeySelective(AppKeywordsTrend record);

    int updateByPrimaryKey(AppKeywordsTrend record);
}