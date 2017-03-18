package com.jzt.api.service;

import com.jzt.api.domain.Platform;
import com.jzt.api.domain.ProblemPlat;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * Created by wanghuan on 10/03/2017.
 */
public interface ProblemService {
    List<Platform> list(Platform report);
    
    /**
     * liaokaihong 20170318
     */
    List<ProblemPlat> selectProblemPlatByType(Integer type);
    
}
