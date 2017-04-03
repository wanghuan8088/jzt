package com.jzt.api.service;

import com.jzt.api.domain.P2pDynamic;
import com.jzt.api.domain.P2pThirdEval;
import com.jzt.api.domain.Platform;

import java.util.List;
import java.util.Map;

/**
 *  金融新榜-互金系平台业务层接口
 */

public interface RankP2pService {

    /**
     * 总成交量排行
     * @param p2pDynamic
     * @return
     */
    List<Map> turnover(P2pDynamic p2pDynamic);

    /**
     * 人气排行
     * @param p2pThirdEval
     * @return
     */
    List<P2pThirdEval> popularity(P2pThirdEval p2pThirdEval);

    /**
     * 平均利率排行
     * @param p2pDynamic
     * @return
     */
    List<P2pDynamic> avgInterestRate(P2pDynamic p2pDynamic);

    /**
     * 注册资本排行
     * @param company
     * @return
     */
    List<Platform> registeredCapital(Platform platform);

    /**
     * 运营时间排行
     * @param p2pDynamic
     * @return
     */
    List<P2pDynamic> serviceTime(P2pDynamic p2pDynamic);
}
