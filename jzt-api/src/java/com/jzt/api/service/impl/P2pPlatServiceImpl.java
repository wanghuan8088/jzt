package com.jzt.api.service.impl;

import com.jzt.api.dao.P2pPlatMapper;
import com.jzt.api.domain.P2pPlatExample;
import com.jzt.api.domain.P2pPlat;
import com.jzt.api.service.P2pPlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * p2p平台接口实现
 */

@Service
public class P2pPlatServiceImpl implements P2pPlatService {

    @Autowired
    private P2pPlatMapper p2pPlatMapper;


    /**
     * p2p平台列表
     * @param p2pPlat
     * @return
     */
    @Override
    public List<Map> list(P2pPlat p2pPlat){

        P2pPlatExample example = new P2pPlatExample();
        example.setOrderByClause("create_time desc");// 创建时间降序排序
        example.setStartRow(p2pPlat.getStartRow() * p2pPlat.getPageSize());
        example.setPageSize(p2pPlat.getPageSize());

        List<Map> result = p2pPlatMapper.listP2pPlatWithPlatform(p2pPlat.getStartRow(),p2pPlat.getPageSize());

        return result;
    }

    /**
     * 删除p2p平台
     * @param p2pPlat
     * @return
     */
    @Override
    public void delete(P2pPlat p2pPlat) {
        p2pPlat.setIsDelete(1);
        p2pPlatMapper.removeByPrimaryKey(p2pPlat);
    }
}
