package com.jzt.api.service.impl;

import com.jzt.api.dao.NewsMapper;
import com.jzt.api.domain.BankProduct;
import com.jzt.api.domain.News;
import com.jzt.api.domain.NewsExample;
import com.jzt.api.domain.NewsWithBLOBs;
import com.jzt.api.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 新闻接口实现
 */

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;


    /**
     * 新增新闻
     *
     * @param news
     * @return
     */
    @Override
    public void add(NewsWithBLOBs news) {
        newsMapper.insertSelective(news);
    }

    /**
     * 新闻列表
     *
     * @param news
     * @return
     */
    @Override
    public List<News> list(News news) {

        NewsExample example = new NewsExample();
        example.setOrderByClause("create_time desc");// 创建时间降序排序
        example.setStartRow(news.getStartRow() * news.getPageSize());
        example.setPageSize(news.getPageSize());

        List<News> result = newsMapper.selectByExample(example);

        return result;
    }

    /**
     * 删除新闻
     *
     * @param news
     * @return
     */
    @Override
    public void delete(News news) {
        news.setIsDelete(1);
        newsMapper.removeByPrimaryKey(news);
    }

    /**
     * 新闻详细
     *
     * @param news
     * @return
     */
    @Override
    public News detail(News news) {
        return newsMapper.selectByPrimaryKey(news.getNid());
    }
}
