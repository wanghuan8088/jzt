package com.jzt.api.service;

import java.util.Map;

import com.jzt.api.domain.Charge;

/**
 * 交易类
 * @author hzlihonglin
 *
 */
public interface ChargeService {
	
	Map<String, Object> submitCharge(Charge charge);

	Map<String, Object> updateCharge(Charge charge);

	Map<String, Object> receive(String chargeId, String paid);

	com.pingplusplus.model.Charge createCharge(Charge charge);

}
