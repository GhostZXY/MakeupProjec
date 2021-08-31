package com.hqyj.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hqyj.bean.Stores;
import com.hqyj.dao.StoreDao;

@Service(value="StoreService")
public class StoreServiceImp implements StoreService{
	
	@Resource
	StoreDao storeDao;
	
	
	public StoreDao getStoreDao() {
		return storeDao;
	}

	public void setStoreDao(StoreDao storeDao) {
		this.storeDao = storeDao;
	}

	@Override
	public boolean addStore(Stores store) {
		
		// TODO Auto-generated method stub
		return storeDao.addUser(store) != 0;
	}
	
	

}
