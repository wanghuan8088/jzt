package com.jzt.api.service;

import com.jzt.api.domain.News;

import java.util.List;

/**
 * 新闻接口
 */

public interface NewsService {

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
}
