package com.hqyj.service;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hqyj.bean.Products;

import com.hqyj.dao.BuyerDao;

@Service(value="BuyerService")
public class BuyerServiceImpl implements BuyerService{
	
	@Resource
	BuyerDao BuyerDao;

	@Override
	public List<Products> findAllBuyer() {
		// TODO Auto-generated method stub
		return BuyerDao.quertAllBuyer();
	}

	public BuyerDao getBuyerDao() {
		return BuyerDao;
	}

	public void setBuyerDao(BuyerDao buyerDao) {
		BuyerDao = buyerDao;
	}

	
}
