package com.jzt.api.service;

import com.jzt.api.domain.Company;

/**
 * 公司法人service
 * @author hzlihonglin
 *
 */
public interface CompanyService {

	/**
	 * 根据公司名字取公司和法人信息
	 * @param company
	 * @return
	 */
	Company companyByartificialperson(Company company);
}
