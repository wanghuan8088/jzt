package com.jzt.api.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.common.constant.PingppConstant;
import com.jzt.api.common.util.CommonUtil;
import com.jzt.api.dao.ChargeMapper;
import com.jzt.api.dao.OrdersMapper;
import com.jzt.api.domain.Charge;
import com.jzt.api.domain.Orders;
import com.jzt.api.service.ChargeService;
import com.pingplusplus.Pingpp;
import com.pingplusplus.exception.PingppException;

/**
 *交易实现类
 * @author hzlihonglin
 *
 */
@Service
public class ChargeServiceImpl extends BaseService implements ChargeService {
	
	@Autowired
	private ChargeMapper chargeMapper;
	
	@Autowired
	private OrdersMapper orderMapper;

	@Override
	public Map<String, Object> submitCharge(Charge dto) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
		
			//ping++
			com.pingplusplus.model.Charge charge=createCharge(dto);
			
			dto.setChargeid(charge.getId());
			dto.setCreated(charge.getCreated().toString());
			dto.setPaid(charge.getPaid().toString());
			dto.setRefunded(charge.getRefunded().toString());
			dto.setCurrency("cny");
			
			//save to charge table
			chargeMapper.insertSelective(dto);
			
			// save to order table 
			Orders order=new Orders();
			order.setOrderId(CommonUtil.initialSequenceId("JY"));
			order.setProductId(Integer.valueOf(dto.getProductid()));
			order.setChargeId(charge.getId());
			order.setAmount(charge.getAmount());
			order.setStatus(1);
			order.setUserId(Integer.valueOf(dto.getUserId()));
			
			orderMapper.insertSelective(order);
			
			result.put("message", "Success");
			result.put("res", "0");
			result.put("data", charge);
		} catch (Exception e) {
			logger.error(e.getMessage());
			  result.put("message", "Failed");
			  result.put("res", "1");
		}
		
		return result;
	}

	@Override
	public Map<String, Object> updateCharge(Charge dto) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			
			com.pingplusplus.model.Charge charge=createCharge(dto);
			
			//charge result值
			dto.setChargeid(charge.getId());
			dto.setCreated(charge.getCreated().toString());
			dto.setPaid(charge.getPaid().toString());
			dto.setRefunded(charge.getRefunded().toString());
			
			//insert charge table
			chargeMapper.insertSelective(dto);
			result.put("message", "Success");
			result.put("res", "0");
			result.put("data", charge);
		} catch (Exception e) {
			logger.error(e.getMessage());
			result.put("message", "Failed");
			result.put("res", "1");
		}
		 return result;
	}

	@Override
	public Map<String, Object> receive(String chargeId, String paid) {
		Map<String, Object> result = new HashMap<String, Object>();

		Charge dto = new Charge();
		dto.setChargeid(chargeId);
		dto.setPaid(paid);

		// update charge table
		chargeMapper.updateByPrimaryKeySelective(dto);

		// update order table
		Orders orderDTO = new Orders();
		orderDTO.setChargeId(chargeId);
		orderMapper.updateByPrimaryKeySelective(orderDTO);
		result.put("status", "200");
		return result;
	}

	
	@Override
	public com.pingplusplus.model.Charge createCharge(Charge dto) {

		Pingpp.apiKey = PingppConstant.apiKey;

		try {
			Pingpp.privateKeyPath = PingppConstant
					.getStringFromFile(PingppConstant.privateKeyFilePath);
		} catch (Exception e1) {
			logger.error(e1.getMessage());
		}


		com.pingplusplus.model.Charge charge = null;
		Map<String, Object> chargeMap = new HashMap<String, Object>();
		chargeMap.put("amount", dto.getAmount());
													
		chargeMap.put("currency", "cny");
		chargeMap.put("subject", dto.getSubject());
		chargeMap.put("body", dto.getBody());
		String orderNo = new Date().getTime() + PingppConstant.randomString(7);
		chargeMap.put("order_no", orderNo);
		chargeMap.put("channel", dto.getChannel());
		chargeMap.put("client_ip", dto.getClientip()); 
														
		Map<String, String> app = new HashMap<String, String>();
		app.put("id", PingppConstant.appId);
		chargeMap.put("app", app);

		Map<String, Object> extra = new HashMap<String, Object>();
		chargeMap.put("extra", extra);

		dto.setOrderno(orderNo);
		dto.setAppid(PingppConstant.appId);

		try {
			charge = com.pingplusplus.model.Charge.create(chargeMap);
			String chargeString = charge.toString();
			logger.debug(chargeString);
		} catch (PingppException e) {
			logger.error(e.getMessage());
		}
		return charge;
	}

}
