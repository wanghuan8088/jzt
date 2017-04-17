package com.jzt.api.service;

import java.util.Map;

import com.jzt.api.domain.PlatState;
import com.jzt.api.domain.SafeCert;
import com.jzt.api.domain.Tag;

/**
 *user:lsl
 *date:2017年4月11日
 */

public interface PlatSupportService {

	Map<String, Object> findTagsByPage(Tag tag);
	
	Map<String, Object> findStatesByPage(PlatState platState);
	
	Map<String, Object> findSafeCertsByPage(SafeCert safeCert);
	
	Map<String, Object> saveOneTag(Tag record);
	
	Map<String, Object> saveOneState(PlatState platState);
	
	Map<String, Object> saveOneSafeCert(SafeCert safeCert);
	
	Map<String, Object> deleteOneTag(Tag record);
	
	Map<String, Object> deleteOneState(PlatState platState);
	
	Map<String, Object> deleteOneSafeCert(SafeCert safeCert);
}
