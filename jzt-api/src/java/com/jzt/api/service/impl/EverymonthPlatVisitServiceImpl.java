package com.jzt.api.service.impl;

import com.jzt.api.dao.EverymonthPlatVisitMapper;
import com.jzt.api.domain.EverymonthPlatVisit;
import com.jzt.api.domain.EverymonthPlatVisitExample;
import com.jzt.api.service.EverymonthPlatVisitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 平台每日访问量接口实现
 */

@Service
public class EverymonthPlatVisitServiceImpl implements EverymonthPlatVisitService {

    @Autowired
    private EverymonthPlatVisitMapper everymonthplatvisitMapper;


    /**
     * 新增平台每日访问量
     *
     * @param news
     * @return
     */
    @Override
    public void add(EverymonthPlatVisit everymonthplatvisit) {
    	everymonthplatvisitMapper.insertSelective(everymonthplatvisit);
    }

    /**
     * 平台每日访问量列表
     *
     * @param news
     * @return
     */
    @Override
    public List<EverymonthPlatVisit> list(EverymonthPlatVisit everymonthplatvisit) {

    	EverymonthPlatVisitExample example = new EverymonthPlatVisitExample();
        example.setOrderByClause("create_time desc");// 创建时间降序排序
        example.setStartRow(everymonthplatvisit.getStartRow() * everymonthplatvisit.getPageSize());
        example.setPageSize(everymonthplatvisit.getPageSize());

        List<EverymonthPlatVisit> result = everymonthplatvisitMapper.selectByExample(example);

        return result;
    }
    
    /**
     * 修改平台每日访问量
     *
     * @param news
     * @return
     */
    @Override
    public void update(EverymonthPlatVisit everymonthplatvisit) {
    	everymonthplatvisitMapper.updateByPrimaryKeySelective(everymonthplatvisit);
    }

    /**
     * 删除平台每日访问量
     *
     * @param news
     * @return
     */
    @Override
    public void delete(EverymonthPlatVisit everymonthplatvisit) {
        everymonthplatvisitMapper.deleteByPrimaryKey(everymonthplatvisit.getId());
    }

}
