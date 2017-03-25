package com.jzt.api.service.impl;

import com.jzt.api.dao.*;
import com.jzt.api.domain.*;
import com.jzt.api.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 搜索关键字业务层接口实现
 */

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private PlatformMapper platformMapper;
    @Autowired
    private BankProductMapper bankProductMapper;
    @Autowired
    private P2pLoanMapper p2pLoanMapper;
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private AppKeywordsTrendMapper appKeywordsTrendMapper;
	@Autowired
	private BusinessmanMapper businessmanMapper;
	@Autowired
	private StockholderMapper stockholderMapper;

    /**
     * 记录搜索关键字
     * @param platform
     */
    @Override
    public void insert(Platform platform) {

        String keyword = platform.getName();
        AppKeywordsTrendExample example = new AppKeywordsTrendExample();
        example.createCriteria().andKeywordEqualTo(keyword);
        List<AppKeywordsTrend> result = appKeywordsTrendMapper.selectByExample(example);


        if (result != null && result.size() > 0) {
            AppKeywordsTrend record = result.get(0);
            record.setTimes(record.getTimes() + 1);
            appKeywordsTrendMapper.updateByPrimaryKey(record);
        } else {
            AppKeywordsTrend record = new AppKeywordsTrend();
            record.setKeyword(keyword);
            record.setTimes(1);
            appKeywordsTrendMapper.insert(record);
        }

    }

    /**
     * 搜索平台
     * @param platform
     * @return
     */
    @Override
    public List<Platform> platform(Platform platform) {

        PlatformExample example = new PlatformExample();
        example.createCriteria().andNameLike("%" + platform.getName() + "%");
        example.setOrderByClause("start_time");// 综合指数来排序
        example.setStartRow(0);
        example.setPageSize(platform.getPageSize());
        List<Platform> result = platformMapper.selectByExample(example);
        return result;
    }

    /**
     * 搜索银行标的(产品)
     *
     * @param bankProduct
     * @return
     */
    @Override
    public List<BankProduct> bankProduct(BankProduct bankProduct) {

        BankProductExample example = new BankProductExample();
        example.createCriteria().andNameLike("%" + bankProduct.getName() + "%");
        example.setOrderByClause("expect_profit_year desc");
        example.setStartRow(0);
        example.setPageSize(bankProduct.getPageSize());
        List<BankProduct> result = bankProductMapper.selectByExample(example);
        return result;
    }

    /**
     * 搜索p2p标的(产品)
     *
     * @param p2pLoan
     * @return
     */
    @Override
    public List<P2pLoan> p2pLoan(P2pLoan p2pLoan) {

        P2pLoanExample example = new P2pLoanExample();
        example.createCriteria().andNameLike("%" + p2pLoan.getName() + "%");
        example.setOrderByClause("interest_rate desc");
        example.setStartRow(0);
        example.setPageSize(p2pLoan.getPageSize());
        List<P2pLoan> result = p2pLoanMapper.selectByExample(example);
        return result;
    }

    /**
     * 搜索公司
     *
     * @param company
     * @return
     */
    @Override
    public List<Company> company(Company company) {

        CompanyExample example = new CompanyExample();
        example.createCriteria().andNameLike("%" + company.getName() + "%");
        example.setOrderByClause("registered_capital desc");
        example.setStartRow(0);
        example.setPageSize(company.getPageSize());
        List<Company> result = companyMapper.selectByExample(example);
        return result;
    }
    
    /**
     * 搜索高管
     */
	@Override
	public List<Businessman> businessman(Businessman businessman) {
		BusinessmanExample example=new BusinessmanExample();
		example.createCriteria().andNameLike("%"+businessman.getName()+"%");
		example.setOrderByClause("create_time desc");
		example.setStartRow(0);
		example.setPageSize(businessman.getPageSize());
		List<Businessman> result=businessmanMapper.selectByExample(example);
		return result;
	}

	/**
	 * 搜索股东
	 */
	@Override
	public List<Stockholder> stockholder(Stockholder stockholder) {
		StockholderExample example=new StockholderExample();
		example.createCriteria().andNameLike("%"+stockholder.getName()+"%");
		example.setOrderByClause("occupies_compared desc");
		example.setStartRow(0);
		example.setPageSize(stockholder.getPageSize());
		List<Stockholder> result=stockholderMapper.selectByExample(example);
		return result;
	}

	  /**
     * 搜索法人
     *
     * @param company
     * @return
     */
    @Override
    public List<Company> artificialperson(Company company) {

        CompanyExample example = new CompanyExample();
        example.createCriteria().andNameLike("%" + company.getArtificialPerson() + "%");
        example.setOrderByClause("opening_date desc");
        example.setStartRow(0);
        example.setPageSize(company.getPageSize());
        List<Company> result = companyMapper.selectByExample(example);
        return result;
    }
}
