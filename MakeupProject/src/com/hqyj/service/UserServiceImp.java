package com.hqyj.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hqyj.bean.User;
import com.hqyj.dao.UserDao;

@Service(value="UserService")
public class UserServiceImp implements UserService {
	@Resource
	UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public List<User> findAllUser(){
		return userDao.querryAllUser();
	}

	@Override
	public User findUserById(int p_id) {
		// TODO Auto-generated method stub
		return userDao.querryUserById(p_id);
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		if(userDao.queryUserByUsername(user.getU_username())==null){
			return userDao.addUser(user)!=0;
		}
		return false;
	}

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		User u = userDao.queryUserByUsername(user.getU_username());
		if(u!=null && u.getU_password().equals(user.getU_password())){
				return true;
		}
		return false;
	}

	@Override
	public Object findUserByUsername(String loginName) {
		// TODO Auto-generated method stub
		return userDao.queryUserByUsername(loginName);
	}

	@Override
	public boolean modifyUserInfo(User user) {
		// TODO Auto-generated method stub
		
		return userDao.updateUser(user) != 0;
	}

	@Override
	public boolean modifyUserInfoWithHead(User user, MultipartFile head) {
		// TODO Auto-generated method stub
		if(modifyUserInfo(user)){
			//ͷ���ϴ���������
			//ͷ���·������������·�����ڴ洢�����ݿ�
			
			Date date = new Date();//��ȡ��ǰʱ��
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String sux=head.getOriginalFilename().substring(head.getOriginalFilename().lastIndexOf("."));
			String new_name = sdf.format(date)+UUID.randomUUID()+sux;
			
			System.out.println(new_name);
			
			File file = new File("D:\\pic\\head\\"+new_name);
			
			try {
				
				head.transferTo(file);
				user.setU_head_old("/pic/head/"+new_name);
				
				return userDao.updateUserWithPic(user) != 0;
				
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//userDao.updateUserWithPic(user);
		}
		return false;
	}
}
