package com.jzt.api.controller;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzt.api.common.util.CommonUtil;
import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.Orders;
import com.jzt.api.service.OrderService;

/**
 * 订单类API
 * @author hzlihonglin
 *
 */

@Controller
@RequestMapping("/order")
public class OrderController extends BaseController {
	

	@Autowired
	private  OrderService orderService;
	/**
	 * submit
	 * @param 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/submit")
	@ResponseBody
	public Map<String, Object> submit(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		Map<String, Class> classMap = new HashMap<String, Class>();
		Orders dto = (Orders) JSONObject.toBean(jsStr, Orders.class, classMap);
		
		Map<String, Object> result = new HashMap<String, Object>();
	
		dto.setOrderId(CommonUtil.initialSequenceId("JY"));
			
		result = orderService.submit(dto);
		
		return result;
	}
	
	/**
	 * order list
	 * @param 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/orderList")
	@ResponseBody
	public Map<String, Object> orderList(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		Orders dto = (Orders) JSONObject.toBean(jsStr, Orders.class);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result = orderService.queryOrderList(dto);
		return result;
	}
	
	/**
	 * delete order
	 * @param 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	@ResponseBody
	public Map<String, Object> deleteOrder(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		Orders dto = (Orders) JSONObject.toBean(jsStr, Orders.class);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result = orderService.deleteOrder(dto);
		return result;
	}
	
	@RequestMapping(value = "/selecOrderById")
	@ResponseBody
	public Map<String, Object> selecTaskByServId(@RequestParam(value="para", required=true) String para){
		JSONObject jsStr = JSONObject.fromObject(para);
		Orders record = (Orders) JSONObject.toBean(jsStr, Orders.class);
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			result = orderService.selecOrderById(record.getId());
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Error-"+e.getMessage());
		}
		return result;
	}
}
