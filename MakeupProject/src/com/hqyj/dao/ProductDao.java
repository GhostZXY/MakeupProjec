package com.hqyj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hqyj.bean.Product;

public interface ProductDao {
	public List<Product> querryAllProduct();
	public Product querryProductById(@Param("p_id")int p_id);


}
