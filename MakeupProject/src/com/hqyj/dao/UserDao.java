package com.hqyj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hqyj.bean.User;

public interface UserDao {
	
	public List<User> querryAllUser();
	
	public User querryUserById(@Param("id") int id);
	
	public int addUser(User user);
	
	public User queryUserByUsername(@Param("u_username") String u_username);
	
	public int updateUser(User user);
	
	public int updateUserWithPic(User user);
}
