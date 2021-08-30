package com.hqyj.service;

import java.util.List;

import com.hqyj.bean.Product;


public interface ProductService {
	public List<Product> findAllProduct();
	public Product findProductById(int p_id);
	
}
