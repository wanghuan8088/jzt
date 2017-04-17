package com.jzt.api.controller;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzt.api.common.constant.PingppConstant;
import com.jzt.api.common.util.BizLogger;
import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.Charge;
import com.jzt.api.service.ChargeService;
import com.pingplusplus.Pingpp;

/**
 * 交易支付接口
 * @author hzlihonglin
 *
 */

@Controller
@RequestMapping("/rest/{version}/charge")
public class ChargeController extends BaseController {

	@Autowired
	private ChargeService chargeService;

	public BizLogger logger = BizLogger.getLogger(this.getClass());

	/**
	 * submit
	 * 
	 * @param
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/submit")
	@ResponseBody
	public Map<String, Object> submit(
			@RequestParam(value = "para", required = true) String para) {
		JSONObject jsStr = JSONObject.fromObject(para);
		Charge dto = (Charge) JSONObject.toBean(jsStr, Charge.class);

		String ip = getRemoteIp();
		dto.setClientip(ip);
		Map<String, Object> result = new HashMap<String, Object>();

		result = chargeService.submitCharge(dto);
		return result;
	}

	/**
	 * update
	 * 
	 * @param
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/update")
	@ResponseBody
	public Map<String, Object> update(
			@RequestParam(value = "para", required = true) String para) {
		JSONObject jsStr = JSONObject.fromObject(para);

		Charge dto = (Charge) JSONObject.toBean(jsStr, Charge.class);
		String ip = getRemoteIp();

		dto.setClientip(ip);
		Map<String, Object> result = new HashMap<String, Object>();
		result = chargeService.updateCharge(dto);
		return result;
	}

	/**
	 * receive
	 * 
	 * @param
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/receive")
	@ResponseBody
	public Map<String, Object> receive(@RequestParam(value = "para", required = true) String para) {
		Pingpp.apiKey = PingppConstant.apiKey;

		try {
			Pingpp.privateKeyPath = PingppConstant
					.getStringFromFile(PingppConstant.privateKeyFilePath);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		Map<String, Object> result = new HashMap<String, Object>();
		JSONObject jsStr = JSONObject.fromObject(para);
		System.out.println("jsStr:" + jsStr);
		String type = jsStr.getString("type");
		JSONObject dataStr = jsStr.getJSONObject("data");
		JSONObject objectStr = dataStr.getJSONObject("object");
		String chargeId = objectStr.getString("id");
		String paid = objectStr.getString("paid");

		if ("charge.succeeded".equals(type)) {
			result = chargeService.receive(chargeId, paid);

		} else {
			result.put("status", "500");
		}

		return result;

	}

}
