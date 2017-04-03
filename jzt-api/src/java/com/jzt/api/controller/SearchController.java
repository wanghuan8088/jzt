package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.*;
import com.jzt.api.service.KeywordsTrendService;
import com.jzt.api.service.SearchService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 搜索关键字
 */

@Controller
@RequestMapping("/rest/{version}/search")
public class SearchController extends BaseController {

    @Autowired
    private SearchService searchService;

    @Autowired
    private KeywordsTrendService keywordsTrendService;

    /***
     * 搜索关键字
     //* @param keyword  关键字
     //* @param platformCount   搜索结果平台个数
     //* @param companyCount    搜索公司平台个数
     //* @param bankProductCount    搜索结果银行标的个数
     //* @param p2pProductCount     搜索结果p2p标的个数
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/")
    @ResponseBody
    //public Map<String, Object> search(@RequestParam(value="keyword") String keyword,
    //                                  @RequestParam(value="platformCount", required=false) int platformCount,
    //                                  @RequestParam(value="companyCount", required=false) int companyCount,
    //                                  @RequestParam(value="bankProductCount", required=false) int bankProductCount,
    //                                  @RequestParam(value="p2pProductCount", required=false) int p2pProductCount){
    public Map<String, Object> search(@RequestParam(value = "para", required = true) String para) {
        JSONObject jsStr = JSONObject.fromObject(para);
        Search dto = (Search) JSONObject.toBean(jsStr, Search.class);

        String keyword = dto.getKeyword();

        Integer platformStartRow = dto.getPlatformStartRow();
        Integer platformPageSize = dto.getPlatformPageSize();

        Integer companyStartRow = dto.getCompanyStartRow();
        Integer companyPageSize = dto.getCompanyPageSize();

        Integer bankProductStartRow = dto.getBankProductStartRow();
        Integer bankProductPageSize = dto.getBankProductPageSize();

        Integer p2pProductStartRow = dto.getP2pProductStartRow();
        Integer p2pProductPageSize = dto.getP2pProductPageSize();

        Integer newsStartRow = dto.getNewsStartRow();
        Integer newsPageSize = dto.getNewsPageSize();


        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            // 记录搜索关键字
            Platform plat = new Platform();
            plat.setName(keyword);
            searchService.insert(plat);

            // 搜索平台
            if (platformPageSize != null && platformPageSize > 0) {
                Platform platform = new Platform();
                platform.setName(keyword);
                platform.setStartRow(platformStartRow);
                platform.setPageSize(platformPageSize);
                List<Platform> platformList = searchService.platform(platform);
                data.put("platform", platformList);
            }

            // 搜索公司
            if (companyPageSize != null && companyPageSize > 0) {
                Company company = new Company();
                company.setName(keyword);
                company.setStartRow(companyStartRow);
                company.setPageSize(companyPageSize);
                List<Company> companyList = searchService.company(company);
                data.put("company", companyList);
            }

            // 搜索银行标的
            if (bankProductPageSize != null && bankProductPageSize > 0) {
                BankProduct bankProduct = new BankProduct();
                bankProduct.setName(keyword);
                bankProduct.setStartRow(bankProductStartRow);
                bankProduct.setPageSize(bankProductPageSize);
                List<BankProduct> bankProductList = searchService.bankProduct(bankProduct);
                data.put("bankProduct", bankProductList);
            }

            // 搜索p2p标的
            if (p2pProductPageSize != null && p2pProductPageSize > 0) {
                P2pLoan p2pLoan = new P2pLoan();
                p2pLoan.setName(keyword);
                p2pLoan.setStartRow(p2pProductStartRow);
                p2pLoan.setPageSize(p2pProductPageSize);
                List<P2pLoan> p2pLoanList = searchService.p2pLoan(p2pLoan);
                data.put("p2pProduct", p2pLoanList);
            }

            // 搜索p2p标的
            if (newsPageSize != null && newsPageSize > 0) {
                News news = new News();
                news.setTitle(keyword);
                news.setStartRow(newsStartRow);
                news.setPageSize(newsPageSize);
                List<News> newsList = searchService.news(news);
                data.put("news", newsList);
            }

            result.put("data", data);
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-" + e.getMessage());
        }

        return result;
    }


    /***
     * 最常用关键字
     * @param count 结果集大小
     * @return
     */
    @RequestMapping(value = "/hotkeyword/{count}")
    @ResponseBody
    public Map<String, Object> hotkeyword(@PathVariable int count) {

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            List<AppKeywordsTrend> list = keywordsTrendService.query(count);

            data.put("keyword", list);
            result.put("data", data);
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-" + e.getMessage());
        }

        return result;
    }

}
