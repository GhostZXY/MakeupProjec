package com.hqyj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hqyj.bean.Products;

public interface ProductDao {
	//��ѯ������Ʒ
	public List<Products> queryAllProduct();
	//����id��ѯ��Ʒ��ϸ��Ϣ
	public Products queryProductsById(@Param("id") int id);
}
