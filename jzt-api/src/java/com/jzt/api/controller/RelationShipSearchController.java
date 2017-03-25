package com.jzt.api.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.BankProduct;
import com.jzt.api.domain.Businessman;
import com.jzt.api.domain.Company;
import com.jzt.api.domain.P2pLoan;
import com.jzt.api.domain.Platform;
import com.jzt.api.domain.Search;
import com.jzt.api.domain.Stockholder;
import com.jzt.api.service.SearchService;

/**
 *关系搜索接口 
 * @author hzlihonglin
 *
 */
@Controller
@RequestMapping("/rest/{version}/relationshipsearch")
public class RelationShipSearchController extends BaseController {

    @Autowired
    private SearchService searchService;
    
    
    /**
     * 关系搜索-关键字
     * @param para
     * @return
     */
	
    @RequestMapping(method = RequestMethod.POST, value = "/")
    @ResponseBody
    public Map<String, Object> search(@RequestParam(value = "para", required = true) String para)
{
        JSONObject jsStr = JSONObject.fromObject(para);
        Search dto = (Search) JSONObject.toBean(jsStr, Search.class);

        String keyword = dto.getKeyword();
        /**
      //判断一下编码方式，处理url中中文参数的编码问题
		try {
			if( keyword.equals( new String(keyword.getBytes("iso-8859-1"),"iso-8859-1") )  )
			{
				keyword = new String(keyword.getBytes("iso-8859-1"),"utf-8");
			}
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        **/
        Integer platformCount = dto.getPlatformCount();
        Integer companyCount = dto.getCompanyCount();
        Integer stockholderCount = dto.getStockholderCount();
        Integer businessmanCount = dto.getBusinessmanCount();
        

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            
            //搜索股东stockholder表
            if(stockholderCount>0){
            	Stockholder stockholder=new Stockholder();
            	stockholder.setName(keyword);
            	stockholder.setPageSize(stockholderCount);
            	List<Stockholder> stockholderList=searchService.stockholder(stockholder);
            	data.put("stockholder", stockholderList);
            }
            
            //搜索高管businessman表
            if(businessmanCount>0){
            	Businessman businessman=new Businessman();
            	businessman.setName(keyword);
            	businessman.setPageSize(businessmanCount);
            	List<Businessman> businessmanList=searchService.businessman(businessman);
            	data.put("businessman", businessmanList);
            }

            // 搜索平台platform表
            if (platformCount > 0) {
                Platform platform = new Platform();
                platform.setName(keyword);
                platform.setPageSize(platformCount);
                List<Platform> platformList = searchService.platform(platform);
                data.put("platform", platformList);
            }

            // 搜索法人company表
            if (companyCount > 0) {
                Company company = new Company();
                company.setName(keyword);
                company.setPageSize(companyCount);
                List<Company> companyList = searchService.company(company);
                data.put("company", companyList);
            }

            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }
    
    /**
     * 关系搜索 -关联关系
     * @param pid1
     * @param pid2
     * @return
     */
    @RequestMapping(value = "/relationship/{rs1}/{rs2}")
    @ResponseBody
    public Map<String, Object> relationship(@PathVariable(value="rs1") int rs1, @PathVariable(value="rs2") int rs2){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            //TODO 
           //人 VS 人，人 VS 平台， 平台 VS 平台

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
