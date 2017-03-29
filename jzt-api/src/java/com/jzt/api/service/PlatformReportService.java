package com.jzt.api.service;

import com.jzt.api.domain.Report;

import java.util.List;

/**
 *  行业报告业务层接口
 */

public interface PlatformReportService {

    public List<Report> list(Report report);
    public Report detail(Report report);
}
