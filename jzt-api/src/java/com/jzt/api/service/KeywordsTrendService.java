package com.jzt.api.service;

import com.jzt.api.domain.AppKeywordsTrend;

import java.util.List;

/**
 * 关键字搜索次数记录业务接口
 */
public interface KeywordsTrendService {

    /**
     * 查询
     * @param
     * @return
     */
    List<AppKeywordsTrend> query(int pageSize);

}
