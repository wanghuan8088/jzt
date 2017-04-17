package com.jzt.api.service;

import com.jzt.api.domain.SensitiveWord;

import java.util.List;

/**
 * 敏感词接口
 */

public interface SensitiveWordService {

    /**
     * 新增敏感词
     * @param sensitiveword
     * @return
     */
    void add(SensitiveWord sensitiveword);

    /**
     * 敏感词列表
     * @param sensitiveword
     * @return
     */
    List<SensitiveWord> list(SensitiveWord sensitiveword);

    /**
     * 删除敏感词
     * @param sensitiveword
     * @return
     */
    void delete(SensitiveWord sensitiveword);

}
