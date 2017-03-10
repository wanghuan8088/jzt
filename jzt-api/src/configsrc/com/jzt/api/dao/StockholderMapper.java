package com.jzt.api.dao;

import com.jzt.api.domain.Stockholder;
import com.jzt.api.domain.StockholderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockholderMapper {
    int countByExample(StockholderExample example);

    int deleteByExample(StockholderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Stockholder record);

    int insertSelective(Stockholder record);

    List<Stockholder> selectByExample(StockholderExample example);

    Stockholder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Stockholder record, @Param("example") StockholderExample example);

    int updateByExample(@Param("record") Stockholder record, @Param("example") StockholderExample example);

    int updateByPrimaryKeySelective(Stockholder record);

    int updateByPrimaryKey(Stockholder record);
}