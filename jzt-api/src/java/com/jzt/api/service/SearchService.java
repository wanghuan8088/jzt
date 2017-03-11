package com.jzt.api.service;

import com.jzt.api.domain.BankProduct;
import com.jzt.api.domain.Company;
import com.jzt.api.domain.Platform;

import java.util.List;

/**
 * 搜索关键字业务层接口
 */

public interface SearchService {

    /**
     * 搜索平台
     * @param keyWord
     * @return
     */
    List<Platform> platform(String keyWord);

    /**
     * 搜索银行标的(产品)
     * @param keyWord
     * @return
     */
    List<Platform> bankProduct(String keyWord);

    /**
     * 搜索p2p标的(产品)
     * @param keyWord
     * @return
     */
    List<BankProduct> p2pLoan(String keyWord);

    /**
     * 搜索公司
     * @param keyWord
     * @return
     */
    List<Company> company(String keyWord);
}
