package com.jzt.api.service;

import com.jzt.api.domain.EverymonthPlatVisit;

import java.util.List;

/**
 * 平台每日访问量接口
 */

public interface EverymonthPlatVisitService {

    /**
     * 新增平台每日访问量
     * @param sensitiveword
     * @return
     */
    void add(EverymonthPlatVisit everymonthplatvisit);

    /**
     * 平台每日访问量列表
     * @param sensitiveword
     * @return
     */
    List<EverymonthPlatVisit> list(EverymonthPlatVisit everymonthplatvisit);
    
    /**
     * 修改平台每日访问量
     * @param news
     * @return
     */
    void update(EverymonthPlatVisit everymonthplatvisit);

    /**
     * 删除平台每日访问量
     * @param sensitiveword
     * @return
     */
    void delete(EverymonthPlatVisit everymonthplatvisit);

}
