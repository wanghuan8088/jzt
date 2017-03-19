package com.jzt.api.service.impl;

import com.jzt.api.dao.CompanyMapper;
import com.jzt.api.dao.P2pDynamicMapper;
import com.jzt.api.dao.P2pThirdEvalMapper;
import com.jzt.api.domain.Company;
import com.jzt.api.domain.P2pDynamic;
import com.jzt.api.domain.P2pThirdEval;
import com.jzt.api.service.RankP2pService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 金融新榜-互金系平台业务层接口实现
 */

@Service
public class RankP2pServiceImpl implements RankP2pService {

    @Autowired
    private P2pDynamicMapper p2pDynamicMapper;

    @Autowired
    private P2pThirdEvalMapper p2pThirdEvalMapper;

    @Autowired
    private CompanyMapper companyMapper;

    /**
     * 总成交量排行
     * @param p2pDynamic
     * @return
     */
    @Override
    public List<P2pDynamic> turnover(P2pDynamic p2pDynamic) {
        // TODO: 19/03/2017
        return null;
    }

    /**
     * 人气排行
     * @param p2pThirdEval
     * @return
     */
    @Override
    public List<P2pThirdEval> popularity(P2pThirdEval p2pThirdEval) {
        // TODO: 19/03/2017
        return null;
    }

    /**
     * 平均利率排行
     * @param p2pDynamic
     * @return
     */
    @Override
    public List<P2pDynamic> avgInterestRate(P2pDynamic p2pDynamic) {
        // TODO: 19/03/2017
        return null;
    }

    /**
     * 注册资本排行
     * @param company
     * @return
     */
    @Override
    public List<Company> registeredCapital(Company company) {
        // TODO: 19/03/2017
        return null;
    }

    /**
     * 运营时间排行
     * @param p2pDynamic
     * @return
     */
    @Override
    public List<P2pDynamic> serviceTime(P2pDynamic p2pDynamic) {
        // TODO: 19/03/2017
        return null;
    }
}
