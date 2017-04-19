package com.jzt.api.service.impl;

import com.jzt.api.dao.EveryweekPlatVisitMapper;
import com.jzt.api.domain.EveryweekPlatVisit;
import com.jzt.api.domain.EveryweekPlatVisitExample;
import com.jzt.api.service.EveryweekPlatVisitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 平台每日访问量接口实现
 */

@Service
public class EveryweekPlatVisitServiceImpl implements EveryweekPlatVisitService {

    @Autowired
    private EveryweekPlatVisitMapper everyweekplatvisitMapper;


    /**
     * 新增平台每日访问量
     *
     * @param news
     * @return
     */
    @Override
    public void add(EveryweekPlatVisit everyweekplatvisit) {
    	everyweekplatvisitMapper.insertSelective(everyweekplatvisit);
    }

    /**
     * 平台每日访问量列表
     *
     * @param news
     * @return
     */
    @Override
    public List<EveryweekPlatVisit> list(EveryweekPlatVisit everyweekplatvisit) {

    	EveryweekPlatVisitExample example = new EveryweekPlatVisitExample();
        example.setOrderByClause("create_time desc");// 创建时间降序排序
        example.setStartRow(everyweekplatvisit.getStartRow() * everyweekplatvisit.getPageSize());
        example.setPageSize(everyweekplatvisit.getPageSize());

        List<EveryweekPlatVisit> result = everyweekplatvisitMapper.selectByExample(example);

        return result;
    }
    
    /**
     * 修改平台每日访问量
     *
     * @param news
     * @return
     */
    @Override
    public void update(EveryweekPlatVisit everyweekplatvisit) {
    	everyweekplatvisitMapper.updateByPrimaryKeySelective(everyweekplatvisit);
    }

    /**
     * 删除平台每日访问量
     *
     * @param news
     * @return
     */
    @Override
    public void delete(EveryweekPlatVisit everyweekplatvisit) {
        everyweekplatvisitMapper.deleteByPrimaryKey(everyweekplatvisit.getId());
    }

}
