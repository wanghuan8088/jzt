package com.jzt.api.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzt.api.dao.PlatformMapper;
import com.jzt.api.dao.ProductMapper;
import com.jzt.api.domain.Product;
import com.jzt.api.domain.ProductExample;
import com.jzt.api.service.ProductService;

/**
 * 购买产品实现类
 * 
 * @author hzlihonglin
 *
 */
@Service
public class ProductServiceImpl extends BaseService implements ProductService {

	@Autowired
	private ProductMapper productMapper;


	@Override
	public Product detail(Product product) {
		return productMapper.selectByPrimaryKey(product.getId());
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		ProductExample example = new ProductExample();
		return productMapper.selectByExample(example);
	}

}
