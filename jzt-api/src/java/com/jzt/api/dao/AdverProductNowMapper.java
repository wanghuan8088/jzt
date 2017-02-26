package com.jzt.api.dao;

import com.jzt.api.domain.AdverProductNow;
import com.jzt.api.domain.AdverProductNowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdverProductNowMapper {
    int countByExample(AdverProductNowExample example);

    int deleteByExample(AdverProductNowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdverProductNow record);

    int insertSelective(AdverProductNow record);

    List<AdverProductNow> selectByExample(AdverProductNowExample example);

    AdverProductNow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdverProductNow record, @Param("example") AdverProductNowExample example);

    int updateByExample(@Param("record") AdverProductNow record, @Param("example") AdverProductNowExample example);

    int updateByPrimaryKeySelective(AdverProductNow record);

    int updateByPrimaryKey(AdverProductNow record);
}