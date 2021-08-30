package com.hqyj.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hqyj.bean.Products;
import com.hqyj.bean.Users;
import com.hqyj.service.ProductService;
import com.hqyj.service.UserService;


@Controller
@RequestMapping("/products")
public class BuyerController {
	@Resource(name="products")
	ProductService productsService;
	@Resource(name = "UserService")
	UserService userService;
	
	//鏌ヨ鎵�鏈�
	@RequestMapping("/buyerhome")
	public String buyerhome(Model model){
		List<Products> productsList=productsService.queryAllProduct();
		model.addAttribute("products",productsList);
		return "buyerhome";
	}
	
	//姝や唬鐮佹煡璇俊鎭紝鏍规嵁瀹㈡埛绔紶鍏ョ殑id锛岃繘琛屾煡璇㈢浉搴旂殑鍟嗗搧淇℃伅
	@RequestMapping("/info")
	public String info(Model model,int id){
		model.addAttribute("productsinfo",productsService.queryById(id));
		return "product";
	}
	
	@RequestMapping("/toRegister")
	public String toRegister(){
		return "register";
	}
	
	@RequestMapping("/register")
	public String register(Users user){
		if(userService.addUser(user)){
			return "buyerHome";
		}
		return "register";
	}
	
	@RequestMapping("/toLogin")
	public String toLogin (){
		return "buyerLogin";
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public String toLogin (Users user){
		if(userService.login(user)){
			return "success";
		}
		return "failed";
	}
	
	@RequestMapping("/modify")
	public String modify(String u_username,String u_password,String u_nickname,
			@RequestParam("u_head") MultipartFile u_head){
		System.out.println(u_username + u_password +u_nickname);
		System.out.println(u_head);
		return "redirect:yer/toModify.action";
	}
	
	public ProductService getProductsService() {
		return productsService;
	}

	public void setProductsService(ProductService productsService) {
		this.productsService = productsService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
}
