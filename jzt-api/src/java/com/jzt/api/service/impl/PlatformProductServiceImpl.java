package com.jzt.api.service.impl;

import com.jzt.api.dao.BankProductMapper;
import com.jzt.api.dao.P2pLoanMapper;
import com.jzt.api.domain.BankProduct;
import com.jzt.api.domain.P2pLoan;
import com.jzt.api.service.PlatformProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 理财产品接口实现
 */

@Service
public class PlatformProductServiceImpl implements PlatformProductService {

    @Autowired
    private P2pLoanMapper p2pLoanMapper;
    @Autowired
    private BankProductMapper bankProductMapper;

    @Override
    public Map p2pDetail(int id) {
        return p2pLoanMapper.selectMapByPrimaryKey(id);
    }

    @Override
    public Map bankDetail(int id) {
        return bankProductMapper.selectMapByPrimaryKey(id);
    }
}
