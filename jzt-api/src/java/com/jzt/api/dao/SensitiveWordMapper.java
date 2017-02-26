package com.jzt.api.dao;

import com.jzt.api.domain.SensitiveWord;
import com.jzt.api.domain.SensitiveWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SensitiveWordMapper {
    int countByExample(SensitiveWordExample example);

    int deleteByExample(SensitiveWordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SensitiveWord record);

    int insertSelective(SensitiveWord record);

    List<SensitiveWord> selectByExample(SensitiveWordExample example);

    SensitiveWord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SensitiveWord record, @Param("example") SensitiveWordExample example);

    int updateByExample(@Param("record") SensitiveWord record, @Param("example") SensitiveWordExample example);

    int updateByPrimaryKeySelective(SensitiveWord record);

    int updateByPrimaryKey(SensitiveWord record);
}