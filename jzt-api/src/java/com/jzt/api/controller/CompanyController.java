package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.dao.CompanyMapper;
import com.jzt.api.domain.Company;
import com.jzt.api.domain.CompanyExample;
import com.jzt.api.service.CompanyService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/rest/{version}/company")
public class CompanyController extends BaseController{
	
	@Autowired
	CompanyService companyService;

	@Autowired
	CompanyMapper companyMapper;
	
	
	
	/**  
	* 用途：返回公司列表
	* 时间：20170418
	*/
	@RequestMapping(value="/list/{startRow}/{pageSize}")
	@ResponseBody
	public Map<String, Object> list(@PathVariable(value="startRow")int startRow,@PathVariable(value="pageSize")int pageSize)
	{
		Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            CompanyExample companyExample = new CompanyExample();
			companyExample.setStartRow(startRow);
			companyExample.setPageSize(pageSize);
            List<Company> list = companyMapper.selectByExample(companyExample);
            data.put("company", list);
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
