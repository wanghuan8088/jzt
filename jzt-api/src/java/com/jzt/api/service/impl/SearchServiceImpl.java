package com.jzt.api.service.impl;

import com.jzt.api.dao.BankProductMapper;
import com.jzt.api.dao.CompanyMapper;
import com.jzt.api.dao.P2pLoanMapper;
import com.jzt.api.dao.PlatformMapper;
import com.jzt.api.domain.*;
import com.jzt.api.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 搜索关键字业务层接口实现
 */

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private PlatformMapper platformMapper;
    @Autowired
    private BankProductMapper bankProductMapper;
    @Autowired
    private P2pLoanMapper p2pLoanMapper;
    @Autowired
    private CompanyMapper companyMapper;

    /**
     * 搜索平台
     *
     * @param platform
     * @return
     */
    @Override
    public List<Platform> platform(Platform platform) {

        PlatformExample example = new PlatformExample();
        example.createCriteria().andNameLike("%" + platform.getName() + "%");
        example.setOrderByClause("start_time");
        example.setStartRow(0);
        example.setPageSize(platform.getPageSize());
        List<Platform> result = platformMapper.selectByExample(example);
        return result;
    }

    /**
     * 搜索银行标的(产品)
     *
     * @param bankProduct
     * @return
     */
    @Override
    public List<BankProduct> bankProduct(BankProduct bankProduct) {

        BankProductExample example = new BankProductExample();
        example.createCriteria().andNameLike("%" + bankProduct.getName() + "%");
        example.setOrderByClause("expect_profit_year desc");
        example.setStartRow(0);
        example.setPageSize(bankProduct.getPageSize());
        List<BankProduct> result = bankProductMapper.selectByExample(example);
        return result;
    }

    /**
     * 搜索p2p标的(产品)
     *
     * @param p2pLoan
     * @return
     */
    @Override
    public List<P2pLoan> p2pLoan(P2pLoan p2pLoan) {

        P2pLoanExample example = new P2pLoanExample();
        example.createCriteria().andNameLike("%" + p2pLoan.getName() + "%");
        example.setOrderByClause("interest_rate desc");
        example.setStartRow(0);
        example.setPageSize(p2pLoan.getPageSize());
        List<P2pLoan> result = p2pLoanMapper.selectByExample(example);
        return result;
    }

    /**
     * 搜索公司
     *
     * @param company
     * @return
     */
    @Override
    public List<Company> company(Company company) {

        CompanyExample example = new CompanyExample();
        example.createCriteria().andNameLike("%" + company.getName() + "%");
        example.setOrderByClause("registered_capital desc");
        example.setStartRow(0);
        example.setPageSize(company.getPageSize());
        List<Company> result = companyMapper.selectByExample(example);
        return result;
    }
}
