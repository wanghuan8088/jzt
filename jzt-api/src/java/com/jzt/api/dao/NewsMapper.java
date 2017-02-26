package com.jzt.api.dao;

import com.jzt.api.domain.News;
import com.jzt.api.domain.NewsExample;
import com.jzt.api.domain.NewsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    int countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(NewsWithBLOBs record);

    int insertSelective(NewsWithBLOBs record);

    List<NewsWithBLOBs> selectByExampleWithBLOBs(NewsExample example);

    List<News> selectByExample(NewsExample example);

    NewsWithBLOBs selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") NewsWithBLOBs record, @Param("example") NewsExample example);

    int updateByExampleWithBLOBs(@Param("record") NewsWithBLOBs record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(NewsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NewsWithBLOBs record);

    int updateByPrimaryKey(News record);
}