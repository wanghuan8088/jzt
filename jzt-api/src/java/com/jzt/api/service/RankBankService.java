package com.jzt.api.service;

import com.jzt.api.domain.BankEval;

import java.util.List;

/**
 *  金融新榜-银行系平台业务层接口
 */

public interface RankBankService {

    /**
     * 能力排行
     * @param bankEval
     * @return
     */
    List<BankEval> turnover(BankEval bankEval);
}
