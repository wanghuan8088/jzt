package com.jzt.api.service.impl;

import com.jzt.api.dao.*;
import com.jzt.api.domain.*;
import com.jzt.api.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Platform product(Platform platform) {


        Platform plat = platformMapper.selectByPrimaryKey(platform.getId());

        // 平台类型（0-p2p,1-银行理财,基金,保险……）


        // 银行
        if (plat.getType() == 1) {

            BankProductExample example = new BankProductExample();
            example.createCriteria().andPlatIdEqualTo(plat.getId());
            example.setOrderByClause("expect_profit_year desc");// 预期年化收益降序排序
            example.setStartRow(0);
            example.setPageSize(platform.getPageSize());

            List<BankProduct> result = bankProductMapper.selectByExample(example);
        }

        // p2p
        if (plat.getType() == 0) {

            P2pLoanExample example = new P2pLoanExample();
            example.createCriteria().andPlatIdEqualTo(plat.getId());
            example.setOrderByClause("interest_rate desc");// 年化收益降序排序
            example.setStartRow(0);
            example.setPageSize(platform.getPageSize());

            List<P2pLoan> result = p2pLoanMapper.selectByExample(example);

        }

        return null;
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
        example.setStartRow(0);
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
        example.setStartRow(0);
        example.setPageSize(platform.getPageSize());
        List<News> result = newsMapper.selectByExample(example);
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
        List<Platform> result = platformMapper.selectByExample(example);
        return result;
    }
}
