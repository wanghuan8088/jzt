package com.jzt.api.service;

import com.jzt.api.domain.Report;
import com.jzt.api.domain.ReportFile;

import java.util.List;

/**
 *  行业报告业务层接口
 */

public interface PlatformReportService {

    public List<Report> list(Report report);
    public Report detail(Report report);
    public List<ReportFile> listByReport(Report report);
    void delete(Report report);
    void update(Report report);
    void add(Report report);
    void addReportFile(ReportFile reportFile);
    void deleteReportFile(ReportFile reportFile);
}
