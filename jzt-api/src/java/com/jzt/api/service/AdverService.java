package com.jzt.api.service;

import com.jzt.api.domain.AdverContentNow;

/**
 * Created by wch on 2017/4/17.
 */
public interface AdverService {
    /**
     * 新增广告
     * @param adverContentNow
     * @return
     */
    void add(AdverContentNow adverContentNow);

    /**
     * 删除广告
     * @param adverContentNow
     * @return
     */
    void delete(AdverContentNow adverContentNow);

    /**
     * 广告详情
     * @param adverContentNow
     * @return
     */
    AdverContentNow detail(AdverContentNow adverContentNow);

    /**
     * 广告更新
     * @param adverContentNow
     * @return
     */
    void edit(AdverContentNow adverContentNow);
}
