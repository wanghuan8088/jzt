package com.jzt.api.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.AdverContentNowMapper;
import com.jzt.api.dao.BankProductMapper;
import com.jzt.api.dao.BusinessmanMapper;
import com.jzt.api.dao.NewsMapper;
import com.jzt.api.dao.P2pLoanMapper;
import com.jzt.api.dao.PlatformMapper;
import com.jzt.api.domain.AdverContentNow;
import com.jzt.api.domain.AdverContentNowExample;
import com.jzt.api.domain.BankProduct;
import com.jzt.api.domain.BankProductExample;
import com.jzt.api.domain.Businessman;
import com.jzt.api.domain.BusinessmanExample;
import com.jzt.api.domain.News;
import com.jzt.api.domain.NewsExample;
import com.jzt.api.domain.P2pLoan;
import com.jzt.api.domain.P2pLoanExample;
import com.jzt.api.domain.Platform;
import com.jzt.api.domain.PlatformExample;
import com.jzt.api.service.PlatformService;

/**
 *  平台业务层接口实现
 */

@Service
public class PlatformServiceImpl implements PlatformService {

    @Autowired
    private PlatformMapper platformMapper;

    @Autowired
    private BusinessmanMapper businessmanMapper;

    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private BankProductMapper bankProductMapper;

    @Autowired
    private P2pLoanMapper p2pLoanMapper;

    @Autowired
    private AdverContentNowMapper adverContentNowMapper;

    /**
     * 平台详细信息
     *
     * @param platform
     * @return
     */
    @Override
    public Platform detail(Platform platform) {
        return platformMapper.selectByPrimaryKey(platform.getId());
    }

    /**
     * 平台对比
     *
     * @param pid1
     * @param pid2
     * @return
     */
    @Override
    public List compare(int pid1, int pid2) {

        Platform plat = platformMapper.selectByPrimaryKey(pid1);
        Platform plat2 = platformMapper.selectByPrimaryKey(pid2);

        // 平台类型（0-p2p,1-银行理财,基金,保险……）

        List list = new ArrayList();

        if (plat.getType() != plat2.getType()) {
            list.add(0);
            list.add(0);
            list.add(2, 2);
        }

        // 银行
        if (plat.getType() == 1) {
            Platform platform1 = new Platform();
            platform1.setId(pid1);
            Platform platform2 = new Platform();
            platform2.setId(pid2);
            Map map1 = detailMoreForBank(platform1);
            Map map2 = detailMoreForBank(platform2);
            list.add(map1);
            list.add(map2);
            list.add(1);
        }

        // p2p
        if (plat.getType() == 0) {
            Platform platform1 = new Platform();
            platform1.setId(pid1);
            Platform platform2 = new Platform();
            platform2.setId(pid2);
            Map map1 = detailMoreForP2p(platform1);
            Map map2 = detailMoreForP2p(platform2);
            list.add(map1);
            list.add(map2);
            list.add(0);
        }

        return list;
    }

    /**
     * 平台详细信息关联更多表(更多)
     *
     * @param platform
     * @return
     */
    @Override
    public Map detailMoreTable(Platform platform) {
        return platformMapper.selectMoreTableByPrimaryKey(platform);
    }

    /**
     * 银行平台详细信息更多
     *
     * @param platform
     * @return
     */
    @Override
    public Map detailMoreForBank(Platform platform) {
        return platformMapper.selectMoreForBank(platform.getId());
    }

    /**
     * 互金平台详细信息更多
     *
     * @param platform
     * @return
     */
    @Override
    public Map detailMoreForP2p(Platform platform) {
        return platformMapper.selectMoreForP2p(platform.getId());
    }

    /**
     * 平台理财产品信息
     *
     * @param platform
     * @return
     */
    @Override
    public List product(Platform platform) {

        Platform plat = platformMapper.selectByPrimaryKey(platform.getId());

        // 平台类型（0-p2p,1-银行理财,基金,保险……）

        List list = new ArrayList();

        // 银行
        if (plat.getType() == 1) {

            BankProductExample example = new BankProductExample();
            example.createCriteria().andPlatIdEqualTo(plat.getId());
            example.setOrderByClause("expect_profit_year desc");// 预期年化收益降序排序
            example.setStartRow(platform.getStartRow() * platform.getPageSize());
            example.setPageSize(platform.getPageSize());

            List<BankProduct> result = bankProductMapper.selectByExample(example);
            list = result;
        }

        // p2p
        if (plat.getType() == 0) {

            P2pLoanExample example = new P2pLoanExample();
            example.createCriteria().andPlatIdEqualTo(plat.getId());
            example.setOrderByClause("interest_rate desc");// 年化收益降序排序
            example.setStartRow(platform.getStartRow() * platform.getPageSize());
            example.setPageSize(platform.getPageSize());

            List<P2pLoan> result = p2pLoanMapper.selectByExample(example);
            list = result;
        }

        return list;
    }

    /**
     * 平台高管信息
     *
     * @param platform
     * @return
     */
    @Override
    public List<Businessman> businessman(Platform platform) {

        Platform plat = platformMapper.selectByPrimaryKey(platform.getId());

        BusinessmanExample example = new BusinessmanExample();
        example.createCriteria().andCidEqualTo(plat.getCompany());
        example.setOrderByClause("work_experience desc");// 工作年限来排序
        example.setStartRow(platform.getStartRow() * platform.getPageSize());
        example.setPageSize(platform.getPageSize());
        List<Businessman> result = businessmanMapper.selectByExample(example);
        return result;
    }

    /**
     * 平台相关新闻
     *
     * @param platform
     * @return
     */
    @Override
    public List<News> news(Platform platform) {

        NewsExample example = new NewsExample();
        example.createCriteria().andPlatIdEqualTo(platform.getId());
        example.setOrderByClause("create_time desc");// 创建时间排序
        example.setStartRow(platform.getStartRow() * platform.getPageSize());
        example.setPageSize(platform.getPageSize());
        List<News> result = newsMapper.selectByExample(example);
        return result;
    }

    /**
     * 首页滚动新闻
     *
     * @param platform
     * @return
     */
    @Override
    public List<News> newsIndex(Platform platform) {

        NewsExample example = new NewsExample();
        example.createCriteria().andCategoryIdEqualTo(9); // 9-首页滚动新闻
        example.setOrderByClause("create_time desc");// 创建时间排序
        example.setStartRow(platform.getStartRow() * platform.getPageSize());
        example.setPageSize(platform.getPageSize());
        List<News> result = newsMapper.selectByExample(example);
        return result;
    }

    /**
     * 首页滚动广告
     *
     * @param platform
     * @return
     */
    @Override
    public List<AdverContentNow> adsIndex(Platform platform) {

        AdverContentNowExample example = new AdverContentNowExample();
        example.setOrderByClause("create_time desc");// 创建时间排序
        example.setStartRow(platform.getStartRow() * platform.getPageSize());
        example.setPageSize(platform.getPageSize());
        List<AdverContentNow> result = adverContentNowMapper.selectByExample(example);
        return result;
    }

    /**
     * 新闻详细信息
     *
     * @param news
     * @return
     */
    @Override
    public News newsDetail(News news) {
        return newsMapper.selectByPrimaryKey(news.getNid());
    }

    /**
     * 相似名称的平台信息
     *
     * @param platform
     * @return
     */
    @Override
    public List<Platform> likeName(Platform platform) {

        PlatformExample example = new PlatformExample();
        example.createCriteria().andNameLike("%" + platform.getName() + "%");
        example.setStartRow(platform.getStartRow() * platform.getPageSize());
        example.setPageSize(platform.getPageSize());
        List<Platform> result = platformMapper.selectByExample(example);
        return result;
    }
    
    /**
     * 筛选银行系
     *
     * @param platform
     * @return
     */
    @Override
    public List<Platform> queryBanks(Platform platform) {

        PlatformExample example = new PlatformExample();
        String strTypes = platform.getTypes();
        
        List<Integer> list = new ArrayList<Integer>();
        if(strTypes!=null && !"".equals(strTypes)){
        	String[] typesarray = strTypes.split(",");
        	for (int i = 0; i < typesarray.length; i++) {
        		String tmpType = typesarray[i];
        		list.add(Integer.valueOf(tmpType.trim()));
			}
        }
        HashMap<String,Object> param = new HashMap<String,Object>();

        param.put("list",list);
        param.put("types",platform.getTypes());

        
        List result = platformMapper.queryBanks(strTypes,list);
        return result;
    }
    
    /**
     * 根据平台具体名字找找平台信息
     */
	@Override
	public Platform platformName(Platform platform) {
		return platformMapper.selectPlatformByName(platform.getName());

	}
}
