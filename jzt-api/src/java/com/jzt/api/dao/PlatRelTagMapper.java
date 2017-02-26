package com.jzt.api.dao;

import com.jzt.api.domain.PlatRelTag;
import com.jzt.api.domain.PlatRelTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatRelTagMapper {
    int countByExample(PlatRelTagExample example);

    int deleteByExample(PlatRelTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlatRelTag record);

    int insertSelective(PlatRelTag record);

    List<PlatRelTag> selectByExample(PlatRelTagExample example);

    PlatRelTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlatRelTag record, @Param("example") PlatRelTagExample example);

    int updateByExample(@Param("record") PlatRelTag record, @Param("example") PlatRelTagExample example);

    int updateByPrimaryKeySelective(PlatRelTag record);

    int updateByPrimaryKey(PlatRelTag record);
}