package com.jzt.api.service.impl;

import com.jzt.api.dao.ReportMapper;
import com.jzt.api.domain.Report;
import com.jzt.api.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanghuan on 10/03/2017.
 */

@Service
public class ReportServiceImpl implements ReportService{

    @Autowired
    private ReportMapper reportMapper;

    @Override
    public List<Report> list(Report report) {
        return reportMapper.selectByExample(null);
    }
}
