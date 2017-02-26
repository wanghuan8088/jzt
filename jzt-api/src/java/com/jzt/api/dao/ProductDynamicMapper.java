package com.jzt.api.dao;

import com.jzt.api.domain.ProductDynamic;
import com.jzt.api.domain.ProductDynamicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDynamicMapper {
    int countByExample(ProductDynamicExample example);

    int deleteByExample(ProductDynamicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductDynamic record);

    int insertSelective(ProductDynamic record);

    List<ProductDynamic> selectByExample(ProductDynamicExample example);

    ProductDynamic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductDynamic record, @Param("example") ProductDynamicExample example);

    int updateByExample(@Param("record") ProductDynamic record, @Param("example") ProductDynamicExample example);

    int updateByPrimaryKeySelective(ProductDynamic record);

    int updateByPrimaryKey(ProductDynamic record);
}