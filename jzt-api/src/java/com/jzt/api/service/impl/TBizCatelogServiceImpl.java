package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.TBizCatelogMapper;
import com.jzt.api.domain.TBizCatelog;
import com.jzt.api.domain.TBizCatelogExample;
import com.jzt.api.service.TBizCatelogService;

/**
 * 功能概要：UserService实现类
 * 
 * @author Kavin
 * @since  2016年4月11日 
 */
@Service
public class TBizCatelogServiceImpl extends BaseService implements TBizCatelogService {

	@Autowired
	private TBizCatelogMapper tBizCatelogMapper;
	
	@Override
	public Map<String, Object> delete(TBizCatelog record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			
			tBizCatelogMapper.deleteByPrimaryKey(record.getId());
			
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("record", record);
			result.put("data", data );
			result.put("res", "0");
			result.put("message", "Success");
			
		} catch (Exception e) {
			Map<String, Object> data = new HashMap<String, Object>();
			result.put("data", data );
			result.put("res", "1");
			result.put("message", "Error-"+e.getMessage());
		}
		return result;
	}


	@Override
	public Map<String, Object> save(TBizCatelog record) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			
			tBizCatelogMapper.insertSelective(record);
			
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("record", record);
			result.put("data", data );
			result.put("res", "0");
			result.put("message", "Success");
			
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Error-"+e.getMessage());
		}
		return result;
	}

	
	
	@Override
	public Map<String, Object> selecBizCatelogByOwnerId(Integer id) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			TBizCatelogExample example = new TBizCatelogExample();
			example.createCriteria().andOwnerIdEqualTo(id);
			List<TBizCatelog> list = tBizCatelogMapper.selectByExample(example);
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
		}
		
		return result;
	}




	@Override
	public int countByExample(TBizCatelogExample example) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public int deleteByExample(TBizCatelogExample example) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public int insert(TBizCatelog record) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public int insertSelective(TBizCatelog record) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public List<TBizCatelog> selectByExample(TBizCatelogExample example) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public TBizCatelog selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public int updateByExampleSelective(TBizCatelog record, TBizCatelogExample example) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public int updateByExample(TBizCatelog record, TBizCatelogExample example) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public int updateByPrimaryKeySelective(TBizCatelog record) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public int updateByPrimaryKey(TBizCatelog record) {
		// TODO Auto-generated method stub
		return 0;
	}


	

	
}
