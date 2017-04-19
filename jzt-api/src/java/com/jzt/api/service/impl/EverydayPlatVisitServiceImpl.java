package com.jzt.api.service.impl;

import com.jzt.api.dao.EverydayPlatVisitMapper;
import com.jzt.api.domain.EverydayPlatVisit;
import com.jzt.api.domain.EverydayPlatVisitExample;
import com.jzt.api.service.EverydayPlatVisitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 平台每日访问量接口实现
 */

@Service
public class EverydayPlatVisitServiceImpl implements EverydayPlatVisitService {

    @Autowired
    private EverydayPlatVisitMapper everydayplatvisitMapper;


    /**
     * 新增平台每日访问量
     *
     * @param news
     * @return
     */
    @Override
    public void add(EverydayPlatVisit everydayplatvisit) {
    	everydayplatvisitMapper.insertSelective(everydayplatvisit);
    }

    /**
     * 平台每日访问量列表
     *
     * @param news
     * @return
     */
    @Override
    public List<EverydayPlatVisit> list(EverydayPlatVisit everydayplatvisit) {

    	EverydayPlatVisitExample example = new EverydayPlatVisitExample();
        example.setOrderByClause("create_time desc");// 创建时间降序排序
        example.setStartRow(everydayplatvisit.getStartRow() * everydayplatvisit.getPageSize());
        example.setPageSize(everydayplatvisit.getPageSize());

        List<EverydayPlatVisit> result = everydayplatvisitMapper.selectByExample(example);

        return result;
    }
    
    /**
     * 修改平台每日访问量
     *
     * @param news
     * @return
     */
    @Override
    public void update(EverydayPlatVisit everydayplatvisit) {
    	everydayplatvisitMapper.updateByPrimaryKeySelective(everydayplatvisit);
    }

    /**
     * 删除平台每日访问量
     *
     * @param news
     * @return
     */
    @Override
    public void delete(EverydayPlatVisit everydayplatvisit) {
        everydayplatvisitMapper.deleteByPrimaryKey(everydayplatvisit.getId());
    }

}
