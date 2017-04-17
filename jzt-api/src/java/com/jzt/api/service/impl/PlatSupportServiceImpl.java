package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.PlatStateMapper;
import com.jzt.api.dao.SafeCertMapper;
import com.jzt.api.dao.TagMapper;
import com.jzt.api.domain.PlatState;
import com.jzt.api.domain.PlatStateExample;
import com.jzt.api.domain.SafeCert;
import com.jzt.api.domain.SafeCertExample;
import com.jzt.api.domain.Tag;
import com.jzt.api.domain.TagExample;
import com.jzt.api.service.PlatSupportService;

/**
 *user:lsl
 *date:2017年4月11日
 */

@Service
public class PlatSupportServiceImpl extends BaseService implements PlatSupportService{

	@Autowired
	private TagMapper tagMapper;
	@Autowired
	private PlatStateMapper platStateMapper;
	@Autowired
	private SafeCertMapper safeCertMapper;
	
	@Override
	public Map<String, Object> findTagsByPage(Tag tag) {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			TagExample example = new TagExample();
			example.setStartRow(tag.getStartPage() * tag.getPageSize());
			example.setPageSize(tag.getPageSize());
			List<Tag> tags = tagMapper.selectByExample(example);
			result = generateNomalResult(tags);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> findStatesByPage(PlatState platState) {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			PlatStateExample example = new PlatStateExample();
			example.setStartRow(platState.getStartPage() * platState.getPageSize());
			example.setPageSize(platState.getPageSize());
			List<PlatState> states = platStateMapper.selectByExample(example);
			result = generateNomalResult(states);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> findSafeCertsByPage(SafeCert safeCert) {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			SafeCertExample example = new SafeCertExample();
			example.setStartRow(safeCert.getStartPage() * safeCert.getPageSize());
			example.setPageSize(safeCert.getPageSize());
			List<SafeCert> safeCerts = safeCertMapper.selectByExample(example);
			result = generateNomalResult(safeCerts);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> saveOneTag(Tag record) {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			tagMapper.insertSelective(record);
			result = generateNomalResult(record);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> saveOneState(PlatState record) {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			platStateMapper.insertSelective(record);
			result = generateNomalResult(record);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> saveOneSafeCert(SafeCert record) {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			safeCertMapper.insertSelective(record);
			result = generateNomalResult(record);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> deleteOneTag(Tag record) {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			tagMapper.deleteByPrimaryKey(record.getId());
			result = generateNomalResult(null);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> deleteOneState(PlatState record) {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			platStateMapper.deleteByPrimaryKey(record.getId());
			result = generateNomalResult(null);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

	@Override
	public Map<String, Object> deleteOneSafeCert(SafeCert record) {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String, Object>();
		
		try{
			safeCertMapper.deleteByPrimaryKey(record.getId());
			result = generateNomalResult(null);
		}catch (Exception e) {
			result = generateErrorResult(e);
		}
		
		return result;
	}

}
