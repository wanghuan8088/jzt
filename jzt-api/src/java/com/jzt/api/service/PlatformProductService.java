package com.jzt.api.service;

import java.util.Map;

/**
 * 理财产品接口
 */
public interface PlatformProductService {

    Map p2pDetail(int id);
    Map bankDetail(int id);

}
