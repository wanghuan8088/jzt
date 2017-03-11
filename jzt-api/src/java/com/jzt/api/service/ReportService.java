package com.jzt.api.service;

import com.jzt.api.domain.Report;

import java.util.List;

/**
 * Created by wanghuan on 10/03/2017.
 */
public interface ReportService {
    List<Report> list(Report report);
}
