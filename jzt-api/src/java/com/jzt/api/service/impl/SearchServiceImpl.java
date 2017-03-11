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
     * @param keyWord
     * @return
     */
    @Override
    public List<Platform> platform(String keyWord) {

        PlatformExample example = new PlatformExample();
        example.createCriteria().andNameLike("%" + keyWord + "%");
        List<Platform> result = platformMapper.selectByExample(example);
        return result;
    }

    /**
     * 搜索银行标的(产品)
     *
     * @param keyWord
     * @return
     */
    @Override
    public List<Platform> bankProduct(String keyWord) {
        return null;
    }

    /**
     * 搜索p2p标的(产品)
     *
     * @param keyWord
     * @return
     */
    @Override
    public List<BankProduct> p2pLoan(String keyWord) {
        return null;
    }

    /**
     * 搜索公司
     *
     * @param keyWord
     * @return
     */
    @Override
    public List<Company> company(String keyWord) {

        CompanyExample example = new CompanyExample();
        example.createCriteria().andNameLike("%" + keyWord + "%");
        List<Company> result = companyMapper.selectByExample(example);
        return result;
    }
}
