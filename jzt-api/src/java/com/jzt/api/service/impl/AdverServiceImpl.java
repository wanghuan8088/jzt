package com.jzt.api.service.impl;

import com.jzt.api.dao.AdverContentNowMapper;
import com.jzt.api.domain.AdverContentNow;
import com.jzt.api.service.AdverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 广告接口实现
 */
@Service
public class AdverServiceImpl implements AdverService {

    @Autowired
    private AdverContentNowMapper adverContentNowMapper;

    /**
     * 新增广告
     * @param adverContentNow
     * @return
     */
    @Override
    public void add(AdverContentNow adverContentNow){
        adverContentNowMapper.insertSelective(adverContentNow);
    }

    /**
     * 删除广告
     * @param adverContentNow
     * @return
     */
    @Override
    public void delete(AdverContentNow adverContentNow){
        adverContentNowMapper.deleteByPrimaryKey(adverContentNow.getAid());
    }

    /**
     * 广告详情
     * @param adverContentNow
     * @return
     */
    @Override
    public AdverContentNow detail(AdverContentNow adverContentNow){
        return adverContentNowMapper.selectByPrimaryKey(adverContentNow.getAid());
    }

    /**
     * 广告更新
     * @param adverContentNow
     * @return
     */
    @Override
    public void edit(AdverContentNow adverContentNow){
        adverContentNowMapper.updateByPrimaryKey(adverContentNow);
    }

}
