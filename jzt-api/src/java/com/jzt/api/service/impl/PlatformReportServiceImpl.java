package com.jzt.api.service.impl;

import com.jzt.api.dao.ReportFileMapper;
import com.jzt.api.dao.ReportMapper;
import com.jzt.api.domain.Report;
import com.jzt.api.domain.ReportExample;
import com.jzt.api.domain.ReportFile;
import com.jzt.api.domain.ReportFileExample;
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
    
    @Autowired
    private ReportFileMapper reportFileMapper;

    @Override
    public List<Report> list(Report report) {

        ReportExample example = new ReportExample();
        example.setStartRow(report.getStartRow() * report.getPageSize());
        example.setPageSize(report.getPageSize());
        example.or().andTypeEqualTo(report.getType());
        example.setOrderByClause("favorites desc");

        return reportMapper.selectByExample(example);
    }

    @Override
    public Report detail(Report report) {
        return reportMapper.selectByPrimaryKey(report.getId());
    }

	@Override
	public List<ReportFile> listByReport(Report report) {
		// TODO Auto-generated method stub
		ReportFileExample example = new ReportFileExample();
		example.setOrderByClause("update_time desc");
		example.or().andRidEqualTo(report.getId());
		return reportFileMapper.selectByExample(example);
		
	}

	@Override
	public void delete(Report report) {
		// TODO Auto-generated method stub
		List<ReportFile> files=listByReport(report);
		if(files!=null)
		{
			for(int i=0;i<files.size();i++)
			{
				ReportFile curfile= files.get(i);
				reportFileMapper.deleteByPrimaryKey(curfile.getId());
			}
		}
		reportMapper.deleteByPrimaryKey(report.getId());
		
	}

	@Override
	public void update(Report report) {
		// TODO Auto-generated method stub
		reportMapper.updateByPrimaryKeySelective(report);
	}

	@Override
	public void add(Report report) {
		// TODO Auto-generated method stub
		reportMapper.insertSelective(report);
	}

	@Override
	public void addReportFile(ReportFile reportFile) {
		// TODO Auto-generated method stub
		reportFileMapper.insertSelective(reportFile);
		
	}

	@Override
	public void deleteReportFile(ReportFile reportFile) {
		// TODO Auto-generated method stub
		reportFileMapper.deleteByPrimaryKey(reportFile.getId());
		
	}
}
