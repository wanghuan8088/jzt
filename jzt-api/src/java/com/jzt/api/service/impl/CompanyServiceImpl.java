package com.jzt.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.CompanyMapper;
import com.jzt.api.domain.Company;
import com.jzt.api.service.CompanyService;
/**
 *  公司法人信息
 * @author hzlihonglin
 *
 */
@Service
public class CompanyServiceImpl  extends BaseService implements CompanyService {

	@Autowired
	private CompanyMapper companyMapper;
	
	/**
	 * 根据公司法人获取
	 */
	@Override
	public Company companyByartificialperson(Company company) {
		return companyMapper.selectCompanyByartificialperson(company.getArtificialPerson());
	}
	
	/**
	 * 獲取公司詳情
	 * @param company
	 * @return
	 */
	@Override
	public Company detail(Company company){
		return companyMapper.selectByPrimaryKey(company.getId());
	} 

}
