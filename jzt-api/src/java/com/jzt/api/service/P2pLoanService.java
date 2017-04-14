package com.jzt.api.service;

import com.jzt.api.domain.P2pLoan;

import java.util.List;
import java.util.Map;

/**
 * p2p标的接口
 */

public interface P2pLoanService {

    /**
     * p2p标的列表
     * @param p2pLoan
     * @return
     */
    List<Map> list(P2pLoan p2pLoan);

    /**
     * 删除p2p标的
     * @param p2pLoan
     * @return
     */
    void delete(P2pLoan p2pLoan);

    /**
     * 获取指定id的标的
     * @author: hjw
     * @param id
     * @return 返回带有平台名称的标的信息
     */
    Map get(Integer id);

    /**
     * 更新标的
     * @author: hjw
     * @param record
     * @return 返回更新状态
     */
    int update(P2pLoan record);

    /**
     * 增加新标的
     * @author: hjw
     * @param record
     * @return
     */
    int add(P2pLoan record);
}
