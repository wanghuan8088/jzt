package com.jzt.api.service;

import com.jzt.api.domain.Exposure;

import java.util.List;

/**
 * Created by wanghuan on 10/03/2017.
 */
public interface ExposureService {
    List<Exposure> list(Exposure exposure);
}
