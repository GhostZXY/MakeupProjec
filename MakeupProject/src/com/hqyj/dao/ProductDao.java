package com.hqyj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hqyj.bean.Products;

public interface ProductDao {
	//查询所有商品
	public List<Products> queryAllProduct();
	//根据id查询商品详细信息
	public Products queryProductsById(@Param("id") int id);
}
