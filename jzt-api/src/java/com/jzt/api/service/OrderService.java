package com.jzt.api.service;

import java.util.Map;

import com.jzt.api.domain.Orders;


/**
 * 订单接口
 * @author hzlihonglin
 *
 */
public interface OrderService {

	Map<String, Object> submit(Orders order);

	Map<String, Object> queryOrderList(Orders dto);

	Map<String, Object> deleteOrder(Orders dto);
	
	Map<String, Object> selecOrderById(Integer id);
}
