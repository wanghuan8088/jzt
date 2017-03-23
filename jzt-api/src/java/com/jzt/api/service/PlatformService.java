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
    List<Object> product(Platform platform);

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

    /**
     * 新闻详细信息
     * @param news
     * @return
     */
    News newsDetail(News news);

    /**
     * 相似名称的平台信息
     * @param platform
     * @return
     */
    List<Platform> likeName(Platform platform);
}
