package com.jzt.api.dao;

import com.jzt.api.domain.PhoneValidate;
import com.jzt.api.domain.PhoneValidateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhoneValidateMapper {
    int countByExample(PhoneValidateExample example);

    int deleteByExample(PhoneValidateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PhoneValidate record);

    int insertSelective(PhoneValidate record);

    List<PhoneValidate> selectByExample(PhoneValidateExample example);

    PhoneValidate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PhoneValidate record, @Param("example") PhoneValidateExample example);

    int updateByExample(@Param("record") PhoneValidate record, @Param("example") PhoneValidateExample example);

    int updateByPrimaryKeySelective(PhoneValidate record);

    int updateByPrimaryKey(PhoneValidate record);
}