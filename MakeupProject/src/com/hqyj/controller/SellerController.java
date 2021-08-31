package com.hqyj.controller;


import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqyj.bean.Stores;
import com.hqyj.bean.User;
import com.hqyj.service.StoreService;
import com.hqyj.service.UserService;

@Controller
@RequestMapping("/seller")
public class SellerController {
	
	@Resource(name="UserService")
	UserService userService;
	
	@Resource(name="StoreService")
	StoreService storeService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/toLogin")
	public String toSellerLogin(){
		return "sellerLogin";
	}
	@ResponseBody
	@RequestMapping("login")
	public String sellerlogin(User user,HttpServletResponse response){
		if(userService.login(user)){
			User u = (User) userService.findUserByUsername(user.getU_username());
			if(u.getU_hasstore().equals("1")){
				response.addCookie(new Cookie("HASSTORE", "true"));
			}else{
				response.addCookie(new Cookie("HASSTORE", "false"));
			}
			return "success";
		}
		return "failed";	
	}
	@RequestMapping("/home")
	public String sellerrHome(){
		
		return "sellerHome";
	}
	
	@RequestMapping("/toAddStore")
	public String toAddStore(){
		
		return "addStore";
	}
	
	@RequestMapping("/addStore")
	public String addStore(Stores store,HttpServletRequest request){
		Cookie []cookies =request.getCookies();
		String username="";
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("LOGINNAME")){
				username=cookie.getValue();
			}
		}
		User user=userService.findUserByUsername(username);
		store.setS_u_id(user.getU_id());
		if(storeService.addStore(store)){
			userService.updateHasStore(user.getU_id());
		}
		//storeService.addStore(store);
		return "sellHome";
		
	}
}
