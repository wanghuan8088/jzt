package com.jzt.api.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.jzt.api.domain.TBizCatelog;
import com.jzt.api.domain.TBizCatelogExample;

public interface TBizCatelogService {
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

	Map<String, Object> selecBizCatelogByOwnerId(Integer id);

	Map<String, Object> save(TBizCatelog record);

	Map<String, Object> delete(TBizCatelog record);
}