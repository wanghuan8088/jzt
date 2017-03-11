package com.jzt.api.service.impl;

import com.jzt.api.dao.ExposureMapper;
import com.jzt.api.domain.Exposure;
import com.jzt.api.domain.ExposureExample;
import com.jzt.api.service.ExposureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  曝光平台业务接口实现
 */

@Service
public class ExposureServiceImpl implements ExposureService {

    @Autowired
    private ExposureMapper exposureMapper;

    @Override
    public List<Exposure> list(Exposure exposure) {
        ExposureExample example = new ExposureExample();
        example.setStartRow(exposure.getStartRow());
        example.setPageSize(exposure.getPageSize());
        example.setOrderByClause("created_date desc");

        return exposureMapper.selectByExample(example);
    }

    @Override
    public List<Exposure> listByPlatform(Exposure exposure) {
        ExposureExample example = new ExposureExample();
        example.createCriteria().andPlatIdEqualTo(exposure.getPlatId());
        example.setStartRow(exposure.getStartRow());
        example.setPageSize(exposure.getPageSize());
        example.setOrderByClause("created_date desc");

        return exposureMapper.selectByExample(example);
    }
}