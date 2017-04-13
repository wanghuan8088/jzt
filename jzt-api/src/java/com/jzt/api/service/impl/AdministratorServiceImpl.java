package com.jzt.api.service.impl;

import com.jzt.api.dao.AdministratorMapper;
import com.jzt.api.domain.BankProduct;
import com.jzt.api.domain.Administrator;
import com.jzt.api.domain.AdministratorExample;
import com.jzt.api.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 管理员接口实现
 * Created by yangyuming on 2017/4/12.
 */

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    private AdministratorMapper administratorMapper;


    /**
     * 新闻列表
     *
     * @param administrator
     * @return
     */
    @Override
    public List<Administrator> list(Administrator administrator) {

        AdministratorExample example = new AdministratorExample();
        example.setOrderByClause("create_time desc");// 创建时间降序排序
        example.setStartRow(administrator.getStartRow() * administrator.getPageSize());
        example.setPageSize(administrator.getPageSize());

        List<Administrator> result = administratorMapper.selectByExample(example);

        return result;
    }

    /**
     * 删除新闻
     *
     * @param administrator
     * @return
     */
    @Override
    public void delete(Administrator administrator) {
        administrator.setIsDelete(1);
        administratorMapper.removeByPrimaryKey(administrator);
    }
}
