package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.UserInformationMapper;
import com.jzt.api.domain.UserInformation;
import com.jzt.api.domain.UserInformationExample;
import com.jzt.api.service.UserInformationService;

/**
 * Desc: UserInformationServiceImpl class
 * 
 * @author Kavin
 * @since  2017-Mar-6 
 */
@Service
public class UserInformationServiceImpl extends BaseService implements UserInformationService {

	@Autowired
	private UserInformationMapper userInformationMapper;
	
	@Override
	public Map<String, Object> save(UserInformation record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			userInformationMapper.insertSelective(record);
			result = generateNomalResult(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}

	@Override
	public Map<String, Object> delete(UserInformation record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			userInformationMapper.deleteByPrimaryKey(record.getUid());
			result = generateNomalResult(record);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}

	

	@Override
	public Map<String, Object> selectByPrimaryKey(Integer id) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			UserInformation record = userInformationMapper.selectByPrimaryKey(id);
			if(record!=null ){
				result = generateNomalResult(record);
			}
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> saveOrUpdate(UserInformation record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			
			if(record.getUid()!=null && record.getUid()!=0){
				
				UserInformation dto = userInformationMapper.selectByPrimaryKey(record.getUid());
				
				if(dto!=null ){
					userInformationMapper.updateByPrimaryKeySelective(record);
				}else{
					userInformationMapper.insertSelective(record);
				}
			}else{
				userInformationMapper.insertSelective(record);
			}
			
			result = generateNomalResult(record);
			
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}

	@Override
	public List<UserInformation> selectByExample(UserInformationExample example) {
		return userInformationMapper.selectByExample(example);
	}

	@Override
	public int insertSelective(UserInformation record) {
		return userInformationMapper.insertSelective(record);
	}

	@Override
	public int countByExample(UserInformationExample example) {
		return userInformationMapper.countByExample(example);
	}

	@Override
	public void updateByExampleSelective(UserInformation record,
			UserInformationExample example) {
		userInformationMapper.updateByExampleSelective(record, example);
	}
	
	
	
	
}
