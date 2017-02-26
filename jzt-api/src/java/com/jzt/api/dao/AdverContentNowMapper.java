package com.jzt.api.dao;

import com.jzt.api.domain.AdverContentNow;
import com.jzt.api.domain.AdverContentNowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdverContentNowMapper {
    int countByExample(AdverContentNowExample example);

    int deleteByExample(AdverContentNowExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(AdverContentNow record);

    int insertSelective(AdverContentNow record);

    List<AdverContentNow> selectByExample(AdverContentNowExample example);

    AdverContentNow selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") AdverContentNow record, @Param("example") AdverContentNowExample example);

    int updateByExample(@Param("record") AdverContentNow record, @Param("example") AdverContentNowExample example);

    int updateByPrimaryKeySelective(AdverContentNow record);

    int updateByPrimaryKey(AdverContentNow record);
}