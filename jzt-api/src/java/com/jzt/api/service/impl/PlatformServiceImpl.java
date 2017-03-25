package com.jzt.api.service.impl;

import com.jzt.api.dao.*;
import com.jzt.api.domain.*;
import com.jzt.api.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *  平台业务层接口实现
 */

@Service
public class PlatformServiceImpl implements PlatformService {

    @Autowired
    private PlatformMapper platformMapper;

    @Autowired
    private BusinessmanMapper businessmanMapper;

    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private BankProductMapper bankProductMapper;

    @Autowired
    private P2pLoanMapper p2pLoanMapper;

    @Autowired
    private AdverContentNowMapper adverContentNowMapper;

    /**
     * 平台详细信息
     *
     * @param platform
     * @return
     */
    @Override
    public Platform detail(Platform platform) {
        return platformMapper.selectByPrimaryKey(platform.getId());
    }

    /**
     * 平台理财产品信息
     *
     * @param platform
     * @return
     */
    @Override
    public List<Object> product(Platform platform) {

        Platform plat = platformMapper.selectByPrimaryKey(platform.getId());

        // 平台类型（0-p2p,1-银行理财,基金,保险……）

        List<Object> list = new ArrayList();

        // 银行
        if (plat.getType() == 1) {

            BankProductExample example = new BankProductExample();
            example.createCriteria().andPlatIdEqualTo(plat.getId());
            example.setOrderByClause("expect_profit_year desc");// 预期年化收益降序排序
            example.setStartRow(platform.getStartRow() * platform.getPageSize());
            example.setPageSize(platform.getPageSize());

            List<BankProduct> result = bankProductMapper.selectByExample(example);
            list.add(result);
        }

        // p2p
        if (plat.getType() == 0) {

            P2pLoanExample example = new P2pLoanExample();
            example.createCriteria().andPlatIdEqualTo(plat.getId());
            example.setOrderByClause("interest_rate desc");// 年化收益降序排序
            example.setStartRow(platform.getStartRow() * platform.getPageSize());
            example.setPageSize(platform.getPageSize());

            List<P2pLoan> result = p2pLoanMapper.selectByExample(example);
            list.add(result);
        }

        return list;
    }

    /**
     * 平台高管信息
     *
     * @param platform
     * @return
     */
    @Override
    public List<Businessman> businessman(Platform platform) {

        Platform plat = platformMapper.selectByPrimaryKey(platform.getId());

        BusinessmanExample example = new BusinessmanExample();
        example.createCriteria().andCidEqualTo(plat.getCompany());
        example.setOrderByClause("work_experience desc");// 工作年限来排序
        example.setStartRow(platform.getStartRow() * platform.getPageSize());
        example.setPageSize(platform.getPageSize());
        List<Businessman> result = businessmanMapper.selectByExample(example);
        return result;
    }

    /**
     * 平台相关新闻
     *
     * @param platform
     * @return
     */
    @Override
    public List<News> news(Platform platform) {

        NewsExample example = new NewsExample();
        example.createCriteria().andPlatIdEqualTo(platform.getId());
        example.setOrderByClause("create_time desc");// 创建时间排序
        example.setStartRow(platform.getStartRow() * platform.getPageSize());
        example.setPageSize(platform.getPageSize());
        List<News> result = newsMapper.selectByExample(example);
        return result;
    }

    /**
     * 首页滚动新闻
     *
     * @param platform
     * @return
     */
    @Override
    public List<News> newsIndex(Platform platform) {

        NewsExample example = new NewsExample();
        example.createCriteria().andCategoryIdEqualTo(9); // 9-首页滚动新闻
        example.setOrderByClause("create_time desc");// 创建时间排序
        example.setStartRow(platform.getStartRow() * platform.getPageSize());
        example.setPageSize(platform.getPageSize());
        List<News> result = newsMapper.selectByExample(example);
        return result;
    }

    /**
     * 首页滚动广告
     *
     * @param platform
     * @return
     */
    @Override
    public List<AdverContentNow> adsIndex(Platform platform) {

        AdverContentNowExample example = new AdverContentNowExample();
        example.setOrderByClause("create_time desc");// 创建时间排序
        example.setStartRow(platform.getStartRow() * platform.getPageSize());
        example.setPageSize(platform.getPageSize());
        List<AdverContentNow> result = adverContentNowMapper.selectByExample(example);
        return result;
    }

    /**
     * 新闻详细信息
     *
     * @param news
     * @return
     */
    @Override
    public News newsDetail(News news) {
        return newsMapper.selectByPrimaryKey(news.getNid());
    }

    /**
     * 相似名称的平台信息
     *
     * @param platform
     * @return
     */
    @Override
    public List<Platform> likeName(Platform platform) {

        PlatformExample example = new PlatformExample();
        example.createCriteria().andNameLike("%" + platform.getName() + "%");
        example.setStartRow(platform.getStartRow() * platform.getPageSize());
        example.setPageSize(platform.getPageSize());
        List<Platform> result = platformMapper.selectByExample(example);
        return result;
    }
}
