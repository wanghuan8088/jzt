package com.jzt.api.service.impl;

import com.jzt.api.dao.CompanyMapper;
import com.jzt.api.dao.P2pDynamicMapper;
import com.jzt.api.dao.P2pThirdEvalMapper;
import com.jzt.api.dao.PlatformMapper;
import com.jzt.api.domain.*;
import com.jzt.api.service.RankP2pService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
    
    @Autowired
    private PlatformMapper platformMapper;

    /**
     * 总成交量排行
     * @param p2pDynamic
     * @return
     */
    @Override
    public List<Map> turnover(P2pDynamic p2pDynamic) {
        // TODO: 19/03/2017
        P2pDynamicExample example = new P2pDynamicExample();
        example.setTagType(p2pDynamic.getTagType());
        example.setOrderByClause("total_turnover desc");
        example.setStartRow(p2pDynamic.getStartRow() * p2pDynamic.getPageSize());
        example.setPageSize(p2pDynamic.getPageSize());
        List<Map> result = p2pDynamicMapper.selectByTurnover(example);
        return result;
    }

    /**
     * 人气排行
     * @param p2pThirdEval
     * @return
     */
    @Override
    public List<P2pThirdEval> popularity(P2pThirdEval p2pThirdEval) {
        // TODO: 19/03/2017
    	P2pThirdEvalExample example = new P2pThirdEvalExample();
    	example.setTagType(p2pThirdEval.getTagType());
    	example.setOrderByClause("popularity desc");
    	example.setStartRow(p2pThirdEval.getStartRow() * p2pThirdEval.getPageSize());
    	example.setPageSize(p2pThirdEval.getPageSize());
    	List<P2pThirdEval> result = p2pThirdEvalMapper.selectBypopularity(example);
        return result;
    }

    /**
     * 平均利率排行
     * @param p2pDynamic
     * @return
     */
    @Override
    public List<Map> avgInterestRate(P2pDynamic p2pDynamic) {
        // TODO: 19/03/2017
        P2pDynamicExample example = new P2pDynamicExample();
        example.setTagType(p2pDynamic.getTagType());
        example.setOrderByClause("avg_interest_rate desc");
        example.setStartRow(p2pDynamic.getStartRow() * p2pDynamic.getPageSize());
        example.setPageSize(p2pDynamic.getPageSize());
        List<Map> result = p2pDynamicMapper.selectByAvgInterestRate(example);
        return result;
    }

    /**
     * 注册资本排行
     * @param platform
     * @return
     */
    @Override
    public List<Platform> registeredCapital(Platform platform) {
        // TODO: 19/03/2017
    	List<Platform> result = platformMapper.selectByRegisteredCapital(platform.getTagType(), platform.getStartRow() * platform.getPageSize(), platform.getPageSize());
        return result;
    }

    /**
     * 运营时间排行
     * @param p2pDynamic
     * @return
     */
    @Override
    public List<Map> serviceTime(P2pDynamic p2pDynamic) {
        // TODO: 19/03/2017
        P2pDynamicExample example = new P2pDynamicExample();
        example.setTagType(p2pDynamic.getTagType());
        example.setOrderByClause("service_time desc");
        example.setStartRow(p2pDynamic.getStartRow() * p2pDynamic.getPageSize());
        example.setPageSize(p2pDynamic.getPageSize());
        List<Map> result = p2pDynamicMapper.selectByServiceTime(example);
        return result;
    }
}
