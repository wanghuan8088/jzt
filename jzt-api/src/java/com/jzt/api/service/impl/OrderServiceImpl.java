package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.jzt.api.dao.OrderMapper;
import com.jzt.api.domain.Order;
import com.jzt.api.domain.OrderExample;
import com.jzt.api.service.OrderService;

/**
 * 订单实现类
 * 
 * @author hzlihonglin
 *
 */
public class OrderServiceImpl extends BaseService implements OrderService {

	@Autowired
	private OrderMapper orderMapper;

	@Override
	public Map<String, Object> submit(Order order) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			orderMapper.insertSelective(order);
			result = generateNomalResult(order);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}

	@Override
	public Map<String, Object> queryOrderList(Order dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> deleteOrder(Order dto) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			orderMapper.deleteByPrimaryKey(dto.getId());
			result = generateNomalResult(dto);
		} catch (Exception e) {
			result = generateErrorResult(e);
		}
		return result;
	}

	@Override
	public Map<String, Object> selecOrderById(Integer id) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			OrderExample example = new OrderExample();
			example.createCriteria().andIdEqualTo(id);
			List<Order> list = orderMapper.selectByExample(example);
			if (list != null) {
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("list", list);
				result.put("data", data);
				result.put("res", "0");
				result.put("message", "Success");
			}
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Error-" + e.getMessage());
			Map<String, Object> data = new HashMap<String, Object>();
			result.put("data", data);
		}

		return result;
	}

}
