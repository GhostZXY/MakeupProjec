package com.hqyj.service;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.hqyj.bean.User;


public interface UserService {
	
	public List<User> findAllUser();
	
	public User findUserById(int id);
	
	public boolean addUser(User user);
	
	public boolean login(User user);
	
	public Object findUserByUsername(String loginName);
	
	public boolean modifyUserInfo(User user);
	
	public boolean modifyUserInfoWithHead(User user,MultipartFile head);
}
