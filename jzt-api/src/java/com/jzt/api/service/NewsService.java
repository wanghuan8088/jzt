package com.jzt.api.service;

import com.jzt.api.domain.News;
import com.jzt.api.domain.NewsWithBLOBs;

import java.util.List;

/**
 * 新闻接口
 */

public interface NewsService {

    /**
     * 新增新闻
     * @param news
     * @return
     */
    void add(NewsWithBLOBs news);

    /**
     * 新闻列表
     * @param news
     * @return
     */
    List<News> list(News news);

    /**
     * 删除新闻
     * @param news
     * @return
     */
    void delete(News news);

    /**
     * 新闻详细
     * @param news
     * @return
     */
    News detail(News news);
}
