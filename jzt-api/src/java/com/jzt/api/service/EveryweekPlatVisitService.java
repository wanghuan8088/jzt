package com.jzt.api.service;

import com.jzt.api.domain.EveryweekPlatVisit;

import java.util.List;

/**
 * 平台每日访问量接口
 */

public interface EveryweekPlatVisitService {

    /**
     * 新增平台每日访问量
     * @param sensitiveword
     * @return
     */
    void add(EveryweekPlatVisit everyweekplatvisit);

    /**
     * 平台每日访问量列表
     * @param sensitiveword
     * @return
     */
    List<EveryweekPlatVisit> list(EveryweekPlatVisit everyweekplatvisit);
    
    /**
     * 修改平台每日访问量
     * @param news
     * @return
     */
    void update(EveryweekPlatVisit everyweekplatvisit);

    /**
     * 删除平台每日访问量
     * @param sensitiveword
     * @return
     */
    void delete(EveryweekPlatVisit everyweekplatvisit);

}
