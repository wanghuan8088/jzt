package com.jzt.api.dao;

import com.jzt.api.domain.ProductNewsRelate;
import com.jzt.api.domain.ProductNewsRelateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductNewsRelateMapper {
    int countByExample(ProductNewsRelateExample example);

    int deleteByExample(ProductNewsRelateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductNewsRelate record);

    int insertSelective(ProductNewsRelate record);

    List<ProductNewsRelate> selectByExample(ProductNewsRelateExample example);

    ProductNewsRelate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductNewsRelate record, @Param("example") ProductNewsRelateExample example);

    int updateByExample(@Param("record") ProductNewsRelate record, @Param("example") ProductNewsRelateExample example);

    int updateByPrimaryKeySelective(ProductNewsRelate record);

    int updateByPrimaryKey(ProductNewsRelate record);
}