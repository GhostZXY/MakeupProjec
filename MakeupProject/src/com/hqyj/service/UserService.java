
package com.hqyj.service;

import java.util.List;

import com.hqyj.bean.Users;


public interface UserService {
	public List<Users> findAllUser();

	public Users queryById(int id);
	
	public boolean addUser(Users user);
	
	public boolean login(Users user);
	
	
}
