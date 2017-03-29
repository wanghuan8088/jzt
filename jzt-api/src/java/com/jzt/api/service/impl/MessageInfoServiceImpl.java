package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.MessageInfoMapper;
import com.jzt.api.domain.MessageInfo;
import com.jzt.api.domain.MessageInfoExample;
import com.jzt.api.service.MessageInfoService;


/** 
* @ClassName: MessageInfoServiceImpl 
* @Description: MessageInfoServiceImpl class
* @author  Kavin
* @date 2017年3月10日 上午9:35:55 
*  
*/
@Service
public class MessageInfoServiceImpl extends BaseService implements MessageInfoService {

	@Autowired
	private MessageInfoMapper messageInfoMapper;
	
	/* (非 Javadoc)  
	* <p>Title: save</p>  
	* <p>Description: </p>  
	* @param record
	* @return  
	* @see com.jzt.api.service.MessageInfoService#save(com.jzt.api.domain.MessageInfo)  
	*/
	@Override
	public Map<String, Object> save(MessageInfo record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			messageInfoMapper.insertSelective(record);
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
	* @see com.jzt.api.service.MessageInfoService#delete(com.jzt.api.domain.MessageInfo)  
	*/
	@Override
	public Map<String, Object> delete(MessageInfo record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			messageInfoMapper.deleteByPrimaryKey(record.getId());
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
	* @see com.jzt.api.service.MessageInfoService#selectOneByPrimaryKey(java.lang.Integer)  
	*/
	@Override
	public Map<String, Object> selectOneByPrimaryKey(Integer id) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			MessageInfo record = messageInfoMapper.selectByPrimaryKey(id);
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
	* @see com.jzt.api.service.MessageInfoService#saveOrUpdate(com.jzt.api.domain.MessageInfo)  
	*/
	@Override
	public Map<String, Object> saveOrUpdate(MessageInfo record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			
			if(record.getId()!=null && record.getId()!=0){
				
				MessageInfo dto = messageInfoMapper.selectByPrimaryKey(record.getId());
				
				if(dto!=null ){
					messageInfoMapper.updateByPrimaryKeySelective(record);
				}else{
					messageInfoMapper.insertSelective(record);
				}
			}else{
				messageInfoMapper.insertSelective(record);
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
	* @see com.jzt.api.service.MessageInfoService#queryListByPage(com.jzt.api.domain.MessageInfo)  
	*/
	@Override
	public Map<String, Object> queryListByPage(MessageInfo record) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			MessageInfoExample example = new MessageInfoExample();
			if(record.getPageSize()>0 && record.getStartPage()>0){
				setOrderByClause(record, example);
			}
			List<MessageInfo> list = messageInfoMapper.selectByExample(example);
			if(list!=null ){
				result = generateNomalResult(list);
			}
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}
	
	
	@Override
	public int countByExample(MessageInfoExample example){
		return messageInfoMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MessageInfoExample example){
		return messageInfoMapper.deleteByExample(example);
	}
    
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return messageInfoMapper.deleteByPrimaryKey(id);
	}
    
    @Override
    public int insert(MessageInfo record) {
		return messageInfoMapper.insert(record);
	}

	@Override
    public int insertSelective(MessageInfo record) {
		return messageInfoMapper.insertSelective(record);
	}

	@Override
	public List<MessageInfo> selectByExample(MessageInfoExample example) {
		
		return messageInfoMapper.selectByExample(example);
	}

	@Override
    public MessageInfo selectByPrimaryKey(Integer id) {
		return messageInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(@Param("record") MessageInfo record, @Param("example") MessageInfoExample example) {
		return messageInfoMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") MessageInfo record, @Param("example") MessageInfoExample example) {
		return messageInfoMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MessageInfo record) {
		return messageInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MessageInfo record) {
		return messageInfoMapper.updateByPrimaryKey(record);
	}
	
}
