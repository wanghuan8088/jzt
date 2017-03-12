package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.*;
import com.jzt.api.service.KeywordsTrendService;
import com.jzt.api.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  搜索关键字
 */

@Controller
@RequestMapping("/rest/{version}/search")
public class SearchController extends BaseController {


    @Autowired
    private SearchService searchService;

    @Autowired
    private KeywordsTrendService keywordsTrendService;


    @RequestMapping(method = RequestMethod.POST, value = "/")
    @ResponseBody
    public Map<String, Object> search(@RequestParam(value="keyword") String keyword,
                                      @RequestParam(value="platformCount", required=false) int platformCount,
                                      @RequestParam(value="companyCount", required=false) int companyCount,
                                      @RequestParam(value="bankProductCount", required=false) int bankProductCount,
                                      @RequestParam(value="p2pProductCount", required=false) int p2pProductCount){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            Platform platform = new Platform();
            platform.setName(keyword);
            platform.setPageSize(platformCount);
            List<Platform> platformList = searchService.platform(platform);
            data.put("platform", platformList);

            Company company = new Company();
            company.setName(keyword);
            company.setPageSize(companyCount);
            List<Company> companyList = searchService.company(company);
            data.put("company", companyList);

            BankProduct bankProduct = new BankProduct();
            bankProduct.setName(keyword);
            bankProduct.setPageSize(bankProductCount);
            List<BankProduct> bankProductList = searchService.bankProduct(bankProduct);
            data.put("bankProduct", bankProductList);

            P2pLoan p2pLoan = new P2pLoan();
            p2pLoan.setName(keyword);
            p2pLoan.setPageSize(p2pProductCount);
            List<P2pLoan> p2pLoanList = searchService.p2pLoan(p2pLoan);
            data.put("p2pProduct", p2pLoanList);

            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }


    @RequestMapping(value = "/hotkeyword/{count}")
    @ResponseBody
    public Map<String, Object> hotkeyword(@PathVariable int count){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            List<AppKeywordsTrend> list = keywordsTrendService.query(count);

            data.put("keyword", list);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }

}
