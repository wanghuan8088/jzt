package com.jzt.api.service;

import com.jzt.api.domain.Exposure;

import java.util.List;

/**
 * 曝光平台业务接口
 */
public interface ExposureService {
    List<Exposure> list(Exposure exposure);

    List<Exposure> listByPlatform(Exposure exposure);

    List<Exposure> listByUser(Exposure exposure);

    Exposure detail(Exposure exposure);

    Exposure platform(Exposure exposure);
}
