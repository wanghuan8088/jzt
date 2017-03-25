package com.jzt.api.service;

import com.jzt.api.domain.BankProduct;
import com.jzt.api.domain.Company;
import com.jzt.api.domain.P2pLoan;
import com.jzt.api.domain.Platform;

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
}
