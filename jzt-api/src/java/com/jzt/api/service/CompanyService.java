package com.jzt.api.service;

import com.jzt.api.domain.Company;

import java.util.List;

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

	/**
	 * 獲取公司詳情
	 * @param company
	 * @return
	 */
	Company detail(Company company);

}
