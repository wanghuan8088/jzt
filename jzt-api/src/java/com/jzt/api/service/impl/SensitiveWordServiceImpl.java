package com.jzt.api.service.impl;

import com.jzt.api.dao.SensitiveWordMapper;
import com.jzt.api.domain.SensitiveWord;
import com.jzt.api.domain.SensitiveWordExample;
import com.jzt.api.service.SensitiveWordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 新闻接口实现
 */

@Service
public class SensitiveWordServiceImpl implements SensitiveWordService {

    @Autowired
    private SensitiveWordMapper sensitivewordMapper;


    /**
     * 新增敏感词
     *
     * @param news
     * @return
     */
    @Override
    public void add(SensitiveWord sensitiveword) {
    	sensitivewordMapper.insertSelective(sensitiveword);
    }

    /**
     * 敏感词列表
     *
     * @param news
     * @return
     */
    @Override
    public List<SensitiveWord> list(SensitiveWord sensitiveword) {

    	SensitiveWordExample example = new SensitiveWordExample();
        example.setOrderByClause("create_time desc");// 创建时间降序排序
        example.setStartRow(sensitiveword.getStartRow() * sensitiveword.getPageSize());
        example.setPageSize(sensitiveword.getPageSize());

        List<SensitiveWord> result = sensitivewordMapper.selectByExample(example);

        return result;
    }

    /**
     * 删除敏感词
     *
     * @param news
     * @return
     */
    @Override
    public void delete(SensitiveWord sensitiveword) {
        sensitivewordMapper.deleteByPrimaryKey(sensitiveword.getId());
    }

}
