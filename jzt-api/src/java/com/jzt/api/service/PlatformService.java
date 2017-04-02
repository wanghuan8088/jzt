package com.jzt.api.service;

import com.jzt.api.domain.AdverContentNow;
import com.jzt.api.domain.Businessman;
import com.jzt.api.domain.News;
import com.jzt.api.domain.Platform;

import java.util.List;
import java.util.Map;

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
     * 平台详细信息关联更多表(更多)
     * @param platform
     * @return
     */
    Map detailMoreTable(Platform platform);

    /**
     * 平台详细信息(更多)
     * @param platform
     * @return
     */
    Object detailMore(Platform platform);

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
     * 首页滚动新闻
     * @param platform
     * @return
     */
    List<News> newsIndex(Platform platform);

    /**
     * 首页滚动广告
     * @param platform
     * @return
     */
    List<AdverContentNow> adsIndex(Platform platform);

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

    /**
     * 根据平台名字查找平台信息
     * @param platform
     * @return
     */
	Platform platformName(Platform platform);
}
