package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.ReportMapper;
import com.jzt.api.domain.Report;
import com.jzt.api.domain.ReportExample;
import com.jzt.api.service.ReportService;


/** 
* @ClassName: ReportServiceImpl 
* @Description: ReportServiceImpl class
* @author  Kavin
* @date 2017年3月10日 上午9:35:55 
*  
*/
@Service
public class ReportServiceImpl extends BaseService implements ReportService {

	@Autowired
	private ReportMapper reportMapper;
	
	/* (非 Javadoc)  
	* <p>Title: save</p>  
	* <p>Description: </p>  
	* @param record
	* @return  
	* @see com.jzt.api.service.ReportService#save(com.jzt.api.domain.Report)  
	*/
	@Override
	public Map<String, Object> save(Report record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			reportMapper.insertSelective(record);
			result = generateNomalResult(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}

	/* (非 Javadoc)  
	* <p>Title: delete</p>  
	* <p>Description: </p>  
	* @param record
	* @return  
	* @see com.jzt.api.service.ReportService#delete(com.jzt.api.domain.Report)  
	*/
	@Override
	public Map<String, Object> delete(Report record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			reportMapper.deleteByPrimaryKey(record.getId());
			result = generateNomalResult(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}

	

	/* (非 Javadoc)  
	* <p>Title: selectOneByPrimaryKey</p>  
	* <p>Description: </p>  
	* @param id
	* @return  
	* @see com.jzt.api.service.ReportService#selectOneByPrimaryKey(java.lang.Integer)  
	*/
	@Override
	public Map<String, Object> selectOneByPrimaryKey(Integer id) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			Report record = reportMapper.selectByPrimaryKey(id);
			if(record!=null ){
				result = generateNomalResult(record);
			}
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	/* (非 Javadoc)  
	* <p>Title: saveOrUpdate</p>  
	* <p>Description: </p>  
	* @param record
	* @return  
	* @see com.jzt.api.service.ReportService#saveOrUpdate(com.jzt.api.domain.Report)  
	*/
	@Override
	public Map<String, Object> saveOrUpdate(Report record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			
			if(record.getId()!=null && record.getId()!=0){
				
				Report dto = reportMapper.selectByPrimaryKey(record.getId());
				
				if(dto!=null ){
					reportMapper.updateByPrimaryKeySelective(record);
				}else{
					reportMapper.insertSelective(record);
				}
			}else{
				reportMapper.insertSelective(record);
			}
			
			result = generateNomalResult(record);
			
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}
	
	/* (非 Javadoc)  
	* <p>Title: queryListByPage</p>  
	* <p>Description: </p>  
	* @param record
	* @return  
	* @see com.jzt.api.service.ReportService#queryListByPage(com.jzt.api.domain.Report)  
	*/
	@Override
	public Map<String, Object> queryListByPage(Report record) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			ReportExample example = new ReportExample();
//			setOrderByClause(record, example);
			List<Report> list = reportMapper.selectByExample(example);
			if(list!=null ){
				result = generateNomalResult(list);
			}
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}
	
	
	@Override
	public int countByExample(ReportExample example){
		return reportMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ReportExample example){
		return reportMapper.deleteByExample(example);
	}
    
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return reportMapper.deleteByPrimaryKey(id);
	}
    
    @Override
    public int insert(Report record) {
		return reportMapper.insert(record);
	}

	@Override
    public int insertSelective(Report record) {
		return reportMapper.insertSelective(record);
	}

	@Override
	public List<Report> selectByExample(ReportExample example) {
		return reportMapper.selectByExample(example);
	}

	@Override
    public Report selectByPrimaryKey(Integer id) {
		return reportMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(@Param("record") Report record, @Param("example") ReportExample example) {
		return reportMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") Report record, @Param("example") ReportExample example) {
		return reportMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Report record) {
		return reportMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Report record) {
		return reportMapper.updateByPrimaryKey(record);
	}

	/* (非 Javadoc)  
	* <p>Title: selectReportsByUid</p>  
	* <p>Description: </p>  
	* @param uid
	* @return  
	* @see com.jzt.api.service.ReportService#selectReportsByUid(int)  
	*/
	@Override
	public Map<String, Object> selectReportsByUid(int uid) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			ReportExample example = new ReportExample();
			List<Report> list = reportMapper.selectReportsByUid(uid);
			if(list!=null ){
				result = generateNomalResult(list);
			}
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}
	
}
