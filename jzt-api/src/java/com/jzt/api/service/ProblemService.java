package com.jzt.api.service;

import com.jzt.api.domain.Platform;
import com.jzt.api.domain.ProblemPlat;

import java.util.List;

/**
 *  问题平台接口
 */
public interface ProblemService {
    List<Platform> list(Platform report);
    
    /**
     * liaokaihong 20170318
     */
    List<ProblemPlat> selectProblemPlatByType(Integer type);
    
}
