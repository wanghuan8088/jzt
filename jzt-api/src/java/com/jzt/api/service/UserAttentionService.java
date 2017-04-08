package com.jzt.api.service;

import com.jzt.api.domain.UserAttentionPlatform;
import com.jzt.api.domain.UserAttentionPlatformExample;
import com.jzt.api.domain.UserAttentionProduct;
import com.jzt.api.domain.UserAttentionProductExample;

import java.util.List;
import java.util.Map;

/**
 *user:lsl
 *date:2017年3月17日
 */

public interface UserAttentionService {

	Map<String, Object> saveAttenPlat(UserAttentionPlatform record);
	
	Map<String, Object> saveAttenPro(UserAttentionProduct record);
	
	Map<String, Object> deleteAttenPlat(UserAttentionPlatformExample record);
	
	Map<String, Object> deleteAttenPro(UserAttentionProductExample record);
	
	List<UserAttentionPlatform> findUserPlatform(UserAttentionPlatform record);
	
	List<UserAttentionProduct> findUserProduct(UserAttentionProduct record);
	
	Map<String, Object> findPlatformByUser(Integer uId, Integer type, Integer startRow, Integer pageSize);

	Map<String, Object> findPlatformByUserP2p(Integer uId, Integer type,Integer startRow, Integer pageSize);
	
	Map<String, Object> findP2pLoanByUser(Integer uId, Integer startRow, Integer pageSize);
	
	Map<String, Object> findBankLoanByUser(Integer uId, Integer startRow, Integer pageSize);
	
}
