package com.jzt.api.service.impl;

import com.jzt.api.dao.PlatformMapper;
import com.jzt.api.domain.Platform;
import com.jzt.api.domain.ProblemPlat;
import com.jzt.api.service.ProblemService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanghuan on 10/03/2017.
 */

@Service
public class ProblemServiceImpl implements ProblemService {
    @Autowired
    private PlatformMapper platformMapper;

    @Override
    public List<Platform> list(Platform platform) {
        return platformMapper.selectByExample(null);
    }
    
    
    /**
     * liaokaihong 20170318
     */
    @Override
    public List<ProblemPlat> selectProblemPlatByType(Integer type)
    {
    	return platformMapper.selectProblemPlatByType(type);
    }

}
