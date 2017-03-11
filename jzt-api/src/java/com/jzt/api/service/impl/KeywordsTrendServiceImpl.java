package com.jzt.api.service.impl;

import com.jzt.api.dao.AppKeywordsTrendMapper;
import com.jzt.api.domain.AppKeywordsTrend;
import com.jzt.api.domain.AppKeywordsTrendExample;
import com.jzt.api.service.KeywordsTrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 关键字搜索次数记录业务接口实现
 */

@Service
public class KeywordsTrendServiceImpl implements KeywordsTrendService {

    @Autowired
    private AppKeywordsTrendMapper appKeywordsTrendMapper;

    /**
     * 查询
     *
     * @return
     */
    @Override
    public List<AppKeywordsTrend> query(int pageSize) {
        AppKeywordsTrendExample example = new AppKeywordsTrendExample();
        example.setOrderByClause("times desc");
        example.setStartRow(0);
        example.setPageSize(pageSize);
        return appKeywordsTrendMapper.selectByExample(example);
    }
}
