package com.jzt.api.dao;

import com.jzt.api.domain.SafeRelWeb;
import com.jzt.api.domain.SafeRelWebExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SafeRelWebMapper {
    int countByExample(SafeRelWebExample example);

    int deleteByExample(SafeRelWebExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SafeRelWeb record);

    int insertSelective(SafeRelWeb record);

    List<SafeRelWeb> selectByExample(SafeRelWebExample example);

    SafeRelWeb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SafeRelWeb record, @Param("example") SafeRelWebExample example);

    int updateByExample(@Param("record") SafeRelWeb record, @Param("example") SafeRelWebExample example);

    int updateByPrimaryKeySelective(SafeRelWeb record);

    int updateByPrimaryKey(SafeRelWeb record);
}