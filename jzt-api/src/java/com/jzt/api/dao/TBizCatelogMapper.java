package com.jzt.api.dao;

import com.jzt.api.domain.TBizCatelog;
import com.jzt.api.domain.TBizCatelogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBizCatelogMapper {
    int countByExample(TBizCatelogExample example);

    int deleteByExample(TBizCatelogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBizCatelog record);

    int insertSelective(TBizCatelog record);

    List<TBizCatelog> selectByExample(TBizCatelogExample example);

    TBizCatelog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBizCatelog record, @Param("example") TBizCatelogExample example);

    int updateByExample(@Param("record") TBizCatelog record, @Param("example") TBizCatelogExample example);

    int updateByPrimaryKeySelective(TBizCatelog record);

    int updateByPrimaryKey(TBizCatelog record);
}