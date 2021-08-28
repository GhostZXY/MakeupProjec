package com.hqyj.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hqyj.bean.Products;
import com.hqyj.dao.ProductDao;

@Service(value = "ProductService")
public class ProductServiceImpl implements ProductService {
	@Resource
	ProductDao productDao;

	@Override
	public List<Products> queryAllProduct() {
		// TODO Auto-generated method stub
		return productDao.queryAllProduct();
	}

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public Products queryById(int id) {
		// TODO Auto-generated method stub
		return productDao.queryProductsById(id);
	}

	
}
