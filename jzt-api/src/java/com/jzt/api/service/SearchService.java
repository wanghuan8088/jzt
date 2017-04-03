package com.jzt.api.service;

import com.jzt.api.domain.*;

import java.util.List;

/**
 * 搜索关键字业务层接口
 */

public interface SearchService {

    /**
     * 记录搜索关键字
     * @param platform
     * @return
     */
    void insert(Platform platform);

    /**
     * 搜索平台
     * @param platform
     * @return
     */
    List<Platform> platform(Platform platform);

    /**
     * 搜索银行标的(产品)
     * @param bankProduct
     * @return
     */
    List<BankProduct> bankProduct(BankProduct bankProduct);

    /**
     * 搜索p2p标的(产品)
     * @param p2pLoan
     * @return
     */
    List<P2pLoan> p2pLoan(P2pLoan p2pLoan);

    /**
     * 搜索公司
     * @param company
     * @return
     */
    List<Company> company(Company company);
    
    /**
     * 搜索高管
     * @param businessman
     * @return
     */
    List<Businessman> businessman(Businessman businessman);
    
    /**
     * 搜索股东
     * @param stockholder
     * @return
     */
    List<Stockholder> stockholder(Stockholder stockholder);

    /**
     * 搜索法人
     * @param company
     * @return
     */
	List<Company> artificialperson(Company company);

    /**
     * 搜索新闻
     * @param news
     * @return
     */
    List<News> news(News news);
	
}
