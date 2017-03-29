package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.BankProductMapper;
import com.jzt.api.dao.P2pLoanMapper;
import com.jzt.api.dao.PlatformMapper;
import com.jzt.api.dao.UserAttentionPlatformMapper;
import com.jzt.api.dao.UserAttentionProductMapper;
import com.jzt.api.domain.BankProduct;
import com.jzt.api.domain.P2pLoan;
import com.jzt.api.domain.Platform;
import com.jzt.api.domain.UserAttentionPlatform;
import com.jzt.api.domain.UserAttentionPlatformExample;
import com.jzt.api.domain.UserAttentionProduct;
import com.jzt.api.domain.UserAttentionProductExample;
import com.jzt.api.service.UserAttentionService;

/**
 *user:lsl
 *date:2017年3月17日
 */

@Service
public class UserAttentionServiceImpl extends BaseService implements UserAttentionService {

	@Autowired
	private UserAttentionPlatformMapper userAttentionPlatformMapper;
	@Autowired
	private UserAttentionProductMapper userAttentionProductMapper;
	@Autowired
	private PlatformMapper platformMapper;
	@Autowired
	private P2pLoanMapper p2pLoanMapper;
	@Autowired
	private BankProductMapper bankProductMapper;
	
	@Override
	public Map<String, Object> saveAttenPlat(UserAttentionPlatform record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			userAttentionPlatformMapper.insertSelective(record);
			result = generateNomalResult(record);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> saveAttenPro(UserAttentionProduct record) {
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			userAttentionProductMapper.insertSelective(record);
			result = generateNomalResult(record);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> deleteAttenPlat(UserAttentionPlatformExample record) {
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			userAttentionPlatformMapper.deleteByExample(record);
			result = generateNomalResult(null);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> deleteAttenPro(UserAttentionProductExample record) {
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			userAttentionProductMapper.deleteByExample(record);
			result = generateNomalResult(null);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public List<UserAttentionPlatform> findUserPlatform(
			UserAttentionPlatform record) {
		
		UserAttentionPlatformExample example = new UserAttentionPlatformExample();
		example.createCriteria().andPidEqualTo(record.getPid());
		example.or().andUidEqualTo(record.getUid());
		List<UserAttentionPlatform> result = userAttentionPlatformMapper.selectByAndExample(example);
		return result;
	}

	@Override
	public List<UserAttentionProduct> findUserProduct(
			UserAttentionProduct record) {
		UserAttentionProductExample example = new UserAttentionProductExample();
		example.createCriteria().andPidEqualTo(record.getPid());
		example.or().andUidEqualTo(record.getUid());
		example.or().andTypeEqualTo(record.getType());
		List<UserAttentionProduct> result = userAttentionProductMapper.selectByAndExample(example);
		return result;
	}

	@Override
	public Map<String, Object> findPlatformByUser(Integer uId, Integer type,
			Integer startRow, Integer pageSize) {
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			List<Platform> plats = platformMapper.selectByUserId(uId, type, startRow, pageSize);
			result = generateNomalResult(plats);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> findP2pLoanByUser(Integer uId, Integer startRow,
			Integer pageSize) {
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			List<P2pLoan> p2pLoans = p2pLoanMapper.selectByUserId(uId, startRow, pageSize);
			result = generateNomalResult(p2pLoans);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> findBankLoanByUser(Integer uId,
			Integer startRow, Integer pageSize) {
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			List<BankProduct> records = bankProductMapper.selectByUserId(uId, startRow, pageSize);
			result = generateNomalResult(records);
		}
		catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}

	
}
