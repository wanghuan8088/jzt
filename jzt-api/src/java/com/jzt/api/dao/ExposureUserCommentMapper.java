package com.jzt.api.dao;

import com.jzt.api.domain.ExposureUserComment;
import com.jzt.api.domain.ExposureUserCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExposureUserCommentMapper {
    int countByExample(ExposureUserCommentExample example);

    int deleteByExample(ExposureUserCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExposureUserComment record);

    int insertSelective(ExposureUserComment record);

    List<ExposureUserComment> selectByExample(ExposureUserCommentExample example);

    ExposureUserComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExposureUserComment record, @Param("example") ExposureUserCommentExample example);

    int updateByExample(@Param("record") ExposureUserComment record, @Param("example") ExposureUserCommentExample example);

    int updateByPrimaryKeySelective(ExposureUserComment record);

    int updateByPrimaryKey(ExposureUserComment record);
}