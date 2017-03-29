package com.jzt.api.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
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
import com.jzt.api.service.CompanyService;
import com.jzt.api.service.PlatformService;
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
    @Autowired
    private PlatformService platformService;
    @Autowired
    private CompanyService companyService;
    
    
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
                company.setArtificialPerson(keyword);//公司法人
                company.setPageSize(companyCount);
                List<Company> companyList = searchService.artificialperson(company);
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
     * 人 VS 人，人 VS 平台， 平台 VS 平台
     * @param pid1
     * @param pid2
     * @return
     */
    @RequestMapping(value = "/relationship/{rs1}/{rs2}")
    @ResponseBody
    public Map<String, Object> relationship(@PathVariable(value="rs1") Integer rs1, @PathVariable(value="rs2") Integer rs2){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            //第一步先进行A平台查询
			Platform pa = new Platform();
			pa.setId(rs1);
			Platform platformA = platformService.detail(pa);
			if(platformA!=null){
				 data.put("platformA", platformA);
			}
            //对第二个关键字进行平台查询
			Platform pb = new Platform();
			pb.setId(rs2);
			Platform platformB = platformService.detail(pb);
			if(platformB!=null){
				 data.put("platformB", platformB);
			}else{
				//如果平台为null,则无平台信息;分别遍历公司法人，股东和高管信息
				//step1 获取公司法人信息
				Company cb = new Company();
				cb.setId(rs2);
				Company companyB = companyService.detail(cb);
				if(companyB!=null){
					data.put("companyB", companyB);
				}
				
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
    
}
