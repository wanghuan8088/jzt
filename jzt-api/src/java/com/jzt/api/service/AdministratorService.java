package com.jzt.api.service;

import com.jzt.api.domain.Administrator;

import java.util.List;

/**
 * Created by yangyuming on 2017/4/12.
 */
public interface AdministratorService {
    /**
     * 管理员列表
     * @param administrator
     * @return
     */
    List<Administrator> list(Administrator administrator);

    /**
     * 删除新闻
     * @param administrator
     * @return
     */
    void delete(Administrator administrator);
}
