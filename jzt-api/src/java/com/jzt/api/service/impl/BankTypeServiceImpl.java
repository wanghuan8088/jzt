package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.BankTypeMapper;
import com.jzt.api.domain.BankType;
import com.jzt.api.domain.BankTypeExample;
import com.jzt.api.service.BankTypeService;


/** 
* @ClassName: BankTypeServiceImpl 
* @Description: BankTypeServiceImpl class
* @author  Kavin
* @date 2017年3月10日 上午9:35:55 
*  
*/
@Service
public class BankTypeServiceImpl extends BaseService implements BankTypeService {

	@Autowired
	private BankTypeMapper bankTypeMapper;
	
	/* (非 Javadoc)  
	* <p>Title: save</p>  
	* <p>Description: </p>  
	* @param record
	* @return  
	* @see com.jzt.api.service.BankTypeService#save(com.jzt.api.domain.BankType)  
	*/
	@Override
	public Map<String, Object> save(BankType record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			bankTypeMapper.insertSelective(record);
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
	* @see com.jzt.api.service.BankTypeService#delete(com.jzt.api.domain.BankType)  
	*/
	@Override
	public Map<String, Object> delete(BankType record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			bankTypeMapper.deleteByPrimaryKey(record.getId());
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
	* @see com.jzt.api.service.BankTypeService#selectOneByPrimaryKey(java.lang.Integer)  
	*/
	@Override
	public Map<String, Object> selectOneByPrimaryKey(Integer id) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			BankType record = bankTypeMapper.selectByPrimaryKey(id);
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
	* @see com.jzt.api.service.BankTypeService#saveOrUpdate(com.jzt.api.domain.BankType)  
	*/
	@Override
	public Map<String, Object> saveOrUpdate(BankType record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			
			if(record.getId()!=null && record.getId()!=0){
				
				BankType dto = bankTypeMapper.selectByPrimaryKey(record.getId());
				
				if(dto!=null ){
					bankTypeMapper.updateByPrimaryKeySelective(record);
				}else{
					bankTypeMapper.insertSelective(record);
				}
			}else{
				bankTypeMapper.insertSelective(record);
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
	* @see com.jzt.api.service.BankTypeService#queryListByPage(com.jzt.api.domain.BankType)  
	*/
	@Override
	public Map<String, Object> queryListByPage(BankType record) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			BankTypeExample example = new BankTypeExample();
//			setOrderByClause(record, example);
			List<BankType> list = bankTypeMapper.selectByExample(example);
			if(list!=null ){
				result = generateNomalResult(list);
			}
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}
	
	
	@Override
	public int countByExample(BankTypeExample example){
		return bankTypeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(BankTypeExample example){
		return bankTypeMapper.deleteByExample(example);
	}
    
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return bankTypeMapper.deleteByPrimaryKey(id);
	}
    
    @Override
    public int insert(BankType record) {
		return bankTypeMapper.insert(record);
	}

	@Override
    public int insertSelective(BankType record) {
		return bankTypeMapper.insertSelective(record);
	}

	@Override
	public List<BankType> selectByExample(BankTypeExample example) {
		return bankTypeMapper.selectByExample(example);
	}

	@Override
    public BankType selectByPrimaryKey(Integer id) {
		return bankTypeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(@Param("record") BankType record, @Param("example") BankTypeExample example) {
		return bankTypeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") BankType record, @Param("example") BankTypeExample example) {
		return bankTypeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(BankType record) {
		return bankTypeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(BankType record) {
		return bankTypeMapper.updateByPrimaryKey(record);
	}
	
}
