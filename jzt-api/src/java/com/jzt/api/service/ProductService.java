package com.jzt.api.service;

import java.util.List;
import com.jzt.api.domain.Product;

/**
 * 购买会员套餐
 * @author hzlihonglin
 *
 */
public interface ProductService {

	public List<Product> list(Product product);

	public Product detail(Product product);
	
	public List<Product> list();
}
