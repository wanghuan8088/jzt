package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.TUserMapper;
import com.jzt.api.domain.TUser;
import com.jzt.api.domain.TUserExample;
import com.jzt.api.service.UserService;

/**
 * 功能概要：UserService实现类
 * 
 * @author Kavin
 * @since  2016年4月11日 
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {

	@Autowired
	private TUserMapper tUserMapper;
	

	@Override
	public TUser selectByPrimaryKey(Integer userId) {
		return tUserMapper.selectByPrimaryKey(userId);
		
	}
	
	@Override
	public int insertSelective(TUser record) {
		return tUserMapper.insertSelective(record);
		
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return tUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(TUser record) {
		return tUserMapper.insert(record);
	}

	@Override
	public int updateByPrimaryKeySelective(TUser record) {
		return tUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TUser record) {
		return tUserMapper.updateByPrimaryKey(record);
	}

	@Override
	public int countByExample(TUserExample example) {
		return tUserMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TUserExample example) {
		return tUserMapper.deleteByExample(example);
	}

	@Override
	public List<TUser> selectByExample(TUserExample example) {
		return tUserMapper.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(TUser record, TUserExample example) {
		return tUserMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TUser record, TUserExample example) {
		return tUserMapper.updateByExample(record, example);
	}

	@Override
	public List<TUser> selectFriendByPhone(TUser record) {
		return tUserMapper.selectFriendByPhone(record);
	}

	@Override
	public List<TUser> selectMyFriendByUserId(TUser record) {
		return tUserMapper.selectMyFriendByUserId(record);
	}
	

	
	@Override
	public Map<String, Object> selectUserByReferrerPhone(TUser record) {

		Map<String, Object> result = new HashMap<String, Object>();
		try {
			TUserExample example = new TUserExample();
			example.createCriteria().andReferrerPhoneEqualTo(record.getPhone());
			List<TUser> list = tUserMapper.selectByExample(example);
			if(list!=null ){
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("list", list);
				result.put("data", data );
				result.put("res", "0");
				result.put("message", "Success");
			}
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Error-"+e.getMessage());
			Map<String, Object> data = new HashMap<String, Object>();
			result.put("data", data );
		}
		
		return result;
	}
	
	

}
