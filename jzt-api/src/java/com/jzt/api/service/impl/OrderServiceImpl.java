package com.jzt.api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.OrdersMapper;
import com.jzt.api.domain.Orders;
import com.jzt.api.domain.OrdersExample;
import com.jzt.api.service.OrderService;

/**
 * 
 * 订单接口实现类
 * @author hzlihonglin
 *
 */
@Service
public class OrderServiceImpl extends BaseService implements OrderService {

	@Autowired
	private OrdersMapper orderMapper;

	@Override
	public Map<String, Object> submit(Orders order) {
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
	public Map<String, Object> queryOrderList(Orders dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> deleteOrder(Orders dto) {
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
			OrdersExample example = new OrdersExample();
			example.createCriteria().andIdEqualTo(id);
			List<Orders> list = orderMapper.selectByExample(example);
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
