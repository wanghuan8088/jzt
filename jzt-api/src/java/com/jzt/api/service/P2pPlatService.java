package com.jzt.api.service;

import com.jzt.api.domain.P2pPlat;

import java.util.List;
import java.util.Map;

/**
 * p2p平台接口
 */

public interface P2pPlatService {

    /**
     * p2p平台列表
     * @param p2pPlat
     * @return
     */
    List<Map> list(P2pPlat p2pPlat);

    /**
     * 删除p2p平台
     * @param p2pPlat
     * @return
     */
    void delete(P2pPlat p2pPlat);
}
