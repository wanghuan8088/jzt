package com.jzt.api.dao;

import com.jzt.api.domain.ProductThirdEval;
import com.jzt.api.domain.ProductThirdEvalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductThirdEvalMapper {
    int countByExample(ProductThirdEvalExample example);

    int deleteByExample(ProductThirdEvalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductThirdEval record);

    int insertSelective(ProductThirdEval record);

    List<ProductThirdEval> selectByExample(ProductThirdEvalExample example);

    ProductThirdEval selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductThirdEval record, @Param("example") ProductThirdEvalExample example);

    int updateByExample(@Param("record") ProductThirdEval record, @Param("example") ProductThirdEvalExample example);

    int updateByPrimaryKeySelective(ProductThirdEval record);

    int updateByPrimaryKey(ProductThirdEval record);
}