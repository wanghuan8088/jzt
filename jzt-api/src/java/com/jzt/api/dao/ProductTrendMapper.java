package com.jzt.api.dao;

import com.jzt.api.domain.ProductTrend;
import com.jzt.api.domain.ProductTrendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductTrendMapper {
    int countByExample(ProductTrendExample example);

    int deleteByExample(ProductTrendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductTrend record);

    int insertSelective(ProductTrend record);

    List<ProductTrend> selectByExample(ProductTrendExample example);

    ProductTrend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductTrend record, @Param("example") ProductTrendExample example);

    int updateByExample(@Param("record") ProductTrend record, @Param("example") ProductTrendExample example);

    int updateByPrimaryKeySelective(ProductTrend record);

    int updateByPrimaryKey(ProductTrend record);
}