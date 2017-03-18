package com.jzt.api.service;

import com.jzt.api.domain.Businessman;
import com.jzt.api.domain.News;
import com.jzt.api.domain.Platform;

import java.util.List;

/**
 *  平台业务层接口
 */
public interface PlatformService {

    /**
     * 平台详细信息
     * @param platform
     * @return
     */
    Platform detail(Platform platform);

    /**
     * 平台理财产品信息
     * @param platform
     * @return
     */
    Platform product(Platform platform);

    /**
     * 平台高管信息
     * @param platform
     * @return
     */
    List<Businessman> businessman(Platform platform);

    /**
     * 平台相关新闻
     * @param platform
     * @return
     */
    List<News> news(Platform platform);
}
