package com.jzt.api.service;

import com.jzt.api.domain.EverydayPlatVisit;

import java.util.List;

/**
 * 平台每日访问量接口
 */

public interface EverydayPlatVisitService {

    /**
     * 新增平台每日访问量
     * @param sensitiveword
     * @return
     */
    void add(EverydayPlatVisit everydayplatvisit);

    /**
     * 平台每日访问量列表
     * @param sensitiveword
     * @return
     */
    List<EverydayPlatVisit> list(EverydayPlatVisit everydayplatvisit);
    
    /**
     * 修改平台每日访问量
     * @param news
     * @return
     */
    void update(EverydayPlatVisit everydayplatvisit);

    /**
     * 删除平台每日访问量
     * @param sensitiveword
     * @return
     */
    void delete(EverydayPlatVisit everydayplatvisit);

}
