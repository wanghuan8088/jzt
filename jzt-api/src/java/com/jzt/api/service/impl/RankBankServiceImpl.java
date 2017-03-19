package com.jzt.api.service.impl;

import com.jzt.api.dao.BankEvalMapper;
import com.jzt.api.domain.BankEval;
import com.jzt.api.service.RankBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 金融新榜-银行系平台业务层接口
 */

@Service
public class RankBankServiceImpl implements RankBankService {

    @Autowired
    private BankEvalMapper bankEvalMapper;

    /**
     * 能力排行
     * @param bankEval
     * @return
     */
    @Override
    public List<BankEval> turnover(BankEval bankEval) {
        // TODO: 20/03/2017
        return null;
    }
}
