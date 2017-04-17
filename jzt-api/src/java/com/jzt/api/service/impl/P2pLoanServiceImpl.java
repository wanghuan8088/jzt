package com.jzt.api.service.impl;

import com.jzt.api.dao.P2pLoanMapper;
import com.jzt.api.domain.P2pLoan;
import com.jzt.api.domain.P2pLoanExample;
import com.jzt.api.service.P2pLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * p2p标的接口实现
 */

@Service
public class P2pLoanServiceImpl implements P2pLoanService {

    @Autowired
    private P2pLoanMapper p2pLoanMapper;


    /**
     * p2p标的列表
     *
     * @param p2pLoan
     * @return
     */
    @Override
    public List<Map> list(P2pLoan p2pLoan) {

        P2pLoanExample example = new P2pLoanExample();
        example.setOrderByClause("create_time desc");// 创建时间降序排序
        example.setStartRow(p2pLoan.getStartRow() * p2pLoan.getPageSize());
        example.setPageSize(p2pLoan.getPageSize());

        List<Map> result = p2pLoanMapper.listByExample(example);

        return result;
    }

    /**
     * 删除p2p标的
     *
     * @param p2pLoan
     * @return
     */
    @Override
    public void delete(P2pLoan p2pLoan) {
        p2pLoan.setIsDelete(1);
        p2pLoanMapper.removeByPrimaryKey(p2pLoan);
    }

    /**
     * 查询p2p标的
     *
     * @param id: 标的id
     * @return
     */
    @Override
    public Map get(Integer id) {
            return p2pLoanMapper.selectByPrimaryKeyWithPlatformName(id);
    }

    /**
     * 更新p2p标的
     * @author: hjw
     * @param record
     * @return 返回更新后的内容
     */
    @Override
    public int update(P2pLoan record){
        return p2pLoanMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 增加新p2p标的
     * @author: hjw
     * @param record
     * @return
     */
    @Override
    public int add(P2pLoan record){
        return p2pLoanMapper.insertSelective(record);
    }
}
