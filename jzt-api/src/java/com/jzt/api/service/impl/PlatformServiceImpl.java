package com.jzt.api.service.impl;

import com.jzt.api.dao.BusinessmanMapper;
import com.jzt.api.dao.NewsMapper;
import com.jzt.api.dao.PlatformMapper;
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
}
