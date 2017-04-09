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
     * 平台对比
     * @param pid1,pid2
     * @return
     */
    List compare(int pid1, int pid2);

    /**
     * 平台详细信息关联更多表(更多)
     * @param platform
     * @return
     */
    Map detailMoreTable(Platform platform);

    /**
     * 银行平台详细信息更多
     * @param platform
     * @return
     */
    Map detailMoreForBank(Platform platform);

    /**
     * 互金平台详细信息更多
     * @param platform
     * @return
     */
    Map detailMoreForP2p(Platform platform);

    /**
     * 平台理财产品信息
     * @param platform
     * @return
     */
    List product(Platform platform);

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

	/**
	 * 
	* @Title: queryBanks  
	* @Description: queryBanks 
	* @param @param platform
	* @param @return    设定文件  
	* @return List<Platform>    返回类型  
	* @throws
	 */
	List<Platform> queryBanks(Platform platform);
    /**
     * 平台简介
     * @param platform
     * @return
     */
    Map description(Platform platform);
}
