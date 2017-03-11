package com.jzt.api.service.impl;

import com.jzt.api.dao.ExposureMapper;
import com.jzt.api.domain.Exposure;
import com.jzt.api.service.ExposureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanghuan on 10/03/2017.
 */

@Service
public class ExposureServiceImpl implements ExposureService {

    @Autowired
    private ExposureMapper exposureMapper;

    @Override
    public List<Exposure> list(Exposure exposure) {
        return exposureMapper.selectByExample(null);
    }
}
