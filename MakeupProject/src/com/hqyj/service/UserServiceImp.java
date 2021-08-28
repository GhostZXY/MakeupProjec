package com.hqyj.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hqyj.bean.Users;
import com.hqyj.dao.UserDao;

@Service(value="UserService")
public class UserServiceImp implements UserService{
	@Resource
	UserDao userDao;

	@Override
	public List<Users> findAllUser() {
		// TODO Auto-generated method stub
		return userDao.quertAllUser();
	}
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Users queryById(int id) {
		// TODO Auto-generated method stub
		return userDao.queryUserById(id);
	}
	@Override
	public boolean addUser(Users user) {
		// TODO Auto-generated method stub
		if(userDao.queryUserByUsername(user.getU_username())==null){
			return userDao.addUser(user)!=0;
		}
		return false;
	}

	@Override
	public boolean login(Users user) {
		// TODO Auto-generated method stub
		Users u = userDao.queryUserByUsername(user.getU_username());
		if(u!=null && u.getU_password().equals(user.getU_password())){
				return true;
		}
		return false;
	}
	
}
