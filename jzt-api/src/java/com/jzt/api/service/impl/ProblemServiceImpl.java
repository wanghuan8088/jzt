package com.jzt.api.service.impl;

import com.jzt.api.dao.PlatformMapper;
import com.jzt.api.domain.Platform;
import com.jzt.api.domain.ProblemPlat;
import com.jzt.api.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  问题平台接口实现
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
    public List<ProblemPlat> selectProblemPlatByState(Integer state)
    {
    	return platformMapper.selectProblemPlatByState(state);
    }
    
    @Override
    public List<ProblemPlat> selectAllProblemPlat()
    {
    	return platformMapper.selectAllProblemPlat();
    }
    
    @Override
    public List<ProblemPlat> selectProblemPlatByName(String name)
    {
    	return platformMapper.selectProblemPlatByName(name);
    }

}
