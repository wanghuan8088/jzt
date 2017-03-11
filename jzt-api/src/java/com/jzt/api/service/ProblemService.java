package com.jzt.api.service;

import com.jzt.api.domain.Platform;

import java.util.List;

/**
 * Created by wanghuan on 10/03/2017.
 */
public interface ProblemService {
    List<Platform> list(Platform report);
}
