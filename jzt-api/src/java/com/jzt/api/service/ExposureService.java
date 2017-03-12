package com.jzt.api.service;

import com.jzt.api.domain.Exposure;

import java.util.List;

/**
 *  曝光平台业务接口
 */
public interface ExposureService {
    public List<Exposure> list(Exposure exposure);
    public List<Exposure> listByPlatform(Exposure exposure);
    public Exposure detail(Exposure exposure);
}
