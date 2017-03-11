package com.jzt.api.service;

import java.util.Map;

import com.jzt.api.domain.Order;


/**
 * 订单接口类
 * @author hzlihonglin
 *
 */
public interface OrderService {

	Map<String, Object> submit(Order order);

	Map<String, Object> queryOrderList(Order dto);

	Map<String, Object> deleteOrder(Order dto);
	
	Map<String, Object> selecOrderById(Integer id);
}
