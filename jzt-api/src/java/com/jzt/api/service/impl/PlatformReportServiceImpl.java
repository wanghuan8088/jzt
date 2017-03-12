package com.jzt.api.service.impl;

import com.jzt.api.dao.ReportMapper;
import com.jzt.api.domain.Report;
import com.jzt.api.domain.ReportExample;
import com.jzt.api.service.PlatformReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  行业报告业务层接口实现
 */

@Service
public class PlatformReportServiceImpl implements PlatformReportService {

    @Autowired
    private ReportMapper reportMapper;

    @Override
    public List<Report> list(Report report) {

        ReportExample example = new ReportExample();
        example.setStartRow(report.getStartRow());
        example.setPageSize(report.getPageSize());
        example.setOrderByClause("favorites desc");

        return reportMapper.selectByExample(example);
    }

    @Override
    public Report detail(Report report) {
        return reportMapper.selectByPrimaryKey(report.getId());
    }
}
