package com.hqyj.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hqyj.bean.Products;
import com.hqyj.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Resource(name = "ProductService")
	ProductService productService;

	
	public ProductService getProductService() {
		return productService;
	}


	public void setProductService(ProductService productService) {
		this.productService = productService;
	}


	@RequestMapping("/home")
	public String home(Model model){
		List<Products> productList = productService.queryAllProduct();
		model.addAttribute("productList",productList);
		return "home";
	}
}
