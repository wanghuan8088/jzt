package com.jzt.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.Product;
import com.jzt.api.service.ProductService;

/**
 * 会员套餐
 * 
 * @author hzlihonglin
 *
 */
@Controller
@RequestMapping("/rest/{version}/memberPackage")
public class MemberPackageController extends BaseController {

	@Autowired
	private ProductService productService;

	/**
	 * 列出所有会员套餐列表
	 * 
	 * @return
	 */
	@RequestMapping(value = "/list")
	public Map<String, Object> list() {

		Map<String, Object> result = new HashMap<String, Object>();
		try {
			Map<String, Object> data = new HashMap<String, Object>();

			List<Product> list = productService.list();

			data.put("memberPackage", list);
			result.put("data", data);
			result.put("res", "0");
			result.put("message", "Success");
		} catch (Exception e) {
			result.put("res", "1");
			result.put("message", "Error-" + e.getMessage());
		}

		return result;

	}

	/**
	 * 根据id获取会员套餐
	 * 
	 * @param id
	 *            会员套餐ID
	 * @return
	 */
	@RequestMapping(value = "/{id}")
	@ResponseBody
	public Map<String, Object> detail(@PathVariable(value = "id") int id) {

		Map<String, Object> result = new HashMap<String, Object>();

		try {
			Map<String, Object> data = new HashMap<String, Object>();
			Product product = new Product();
			product.setId(id);
			Product detail = productService.detail(product);

			data.put("memberPackage", detail);
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
