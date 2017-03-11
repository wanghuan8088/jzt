package com.jzt.api.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.common.constant.PingppConstant;
import com.jzt.api.common.util.CommonUtil;
import com.jzt.api.dao.ChargeMapper;
import com.jzt.api.dao.OrderMapper;
import com.jzt.api.domain.Charge;
import com.jzt.api.domain.Order;
import com.jzt.api.service.ChargeService;
import com.pingplusplus.Pingpp;
import com.pingplusplus.exception.PingppException;

/**
 * 交易支付接口
 * @author hzlihonglin
 *
 */
@Service
public class ChargeServiceImpl extends BaseService implements ChargeService {
	
	@Autowired
	private ChargeMapper chargeMapper;
	
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public Map<String, Object> submitCharge(Charge dto) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
		
			//ping++
			com.pingplusplus.model.Charge charge=createCharge(dto);
			
			dto.setChargeid(charge.getId());
			//dto.setCreated(charge.getCreated().toString());
			//dto.setPaid(charge.getPaid().toString());
			//dto.setRefunded(charge.getRefunded().toString());
			
			//save to charge table
			chargeMapper.insertSelective(dto);
			
			// save to order table 
			Order order=new Order();
			order.setOrderId(CommonUtil.initialSequenceId("JY"));
			//order.setProductId(Integer.valueOf(dto.getTaskid()));
			order.setChargeId(charge.getId());
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
			
			//charge resultֵ
			dto.setChargeid(charge.getId());
			//dto.setCreated(charge.getCreated().toString());
			//dto.setPaid(charge.getPaid().toString());
			//dto.setRefunded(charge.getRefunded().toString());
			
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
		//dto.setPaid(paid);

		// update charge table
		chargeMapper.updateByPrimaryKeySelective(dto);

		// update order table
		Order orderDTO = new Order();
		orderDTO.setChargeId(chargeId);
		orderMapper.updateByPrimaryKeySelective(orderDTO);
		result.put("status", "200");
		return result;
	}

	/**
	 * 创建 Charge
	 *
	 * 创建 Charge 用户需要组装一个 map 对象作为参数传递给 Charge.create(); map
	 * 里面参数的具体说明请参考：https://pingxx.com/document/api#api-c-new
	 * 
	 * @return Charge
	 */
	@Override
	public com.pingplusplus.model.Charge createCharge(Charge dto) {

		// 判断订单是否为批量

		// 设置 API Key
		Pingpp.apiKey = PingppConstant.apiKey;

		// 设置私钥路径，用于请求签名
		try {
			Pingpp.privateKeyPath = PingppConstant
					.getStringFromFile(PingppConstant.privateKeyFilePath);
		} catch (Exception e1) {
			logger.error(e1.getMessage());
		}

		/**
		 * 或者直接设置私钥内容 Pingpp.privateKey = "-----BEGIN RSA PRIVATE KEY-----\n" +
		 * "... 私钥内容字符串 ...\n" + "-----END RSA PRIVATE KEY-----\n";
		 */

		com.pingplusplus.model.Charge charge = null;
		Map<String, Object> chargeMap = new HashMap<String, Object>();
		chargeMap.put("amount", dto.getAmount());// 订单总金额, 人民币单位：分（如订单总金额为 1
													// 元，此处请填 100）
		chargeMap.put("currency", "cny");// 默认人民币cny
		chargeMap.put("subject", dto.getSubject());
		chargeMap.put("body", dto.getBody());
		String orderNo = new Date().getTime() + PingppConstant.randomString(7);
		chargeMap.put("order_no", orderNo);// 推荐使用 8-20 位，要求数字或字母，不允许其他字符
		chargeMap.put("channel", dto.getChannel());// 支付使用的第三方支付渠道取值，例如：alipay请参考：https://www.pingxx.com/api#api-c-new
		chargeMap.put("client_ip", dto.getClientip()); // 发起支付请求客户端的 IP 地址，格式为
														// IPV4，如: 127.0.0.1
		Map<String, String> app = new HashMap<String, String>();
		app.put("id", PingppConstant.appId);
		chargeMap.put("app", app);

		Map<String, Object> extra = new HashMap<String, Object>();
		chargeMap.put("extra", extra);

		// 设置chargeDTO的值，为入库做准备
		dto.setOrderno(orderNo);
		dto.setAppid(PingppConstant.appId);

		try {
			// 发起交易请求
			charge = com.pingplusplus.model.Charge.create(chargeMap);
			// 传到客户端请先转成字符create串 .toString(), 调该方法，会自动转成正确的 JSON 字符串
			String chargeString = charge.toString();
			logger.debug(chargeString);
		} catch (PingppException e) {
			logger.error(e.getMessage());
		}
		return charge;
	}

}
