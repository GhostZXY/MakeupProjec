package com.hqyj.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hqyj.bean.Product;
import com.hqyj.dao.ProductDao;

@Service(value="ProductService")
public class ProductServiceImp implements ProductService {
	
	@Resource
	ProductDao productDao;
	
	
	public ProductDao getProductDao() {
		return productDao;
	}


	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}


	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		return productDao.querryAllProduct();
	}


	@Override
	public Product findProductById(int id) {
		// TODO Auto-generated method stub
		return productDao.querryProductById(id);
	}

}

