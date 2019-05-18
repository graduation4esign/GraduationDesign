package com.yuman.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yuman.bean.Product;
import com.yuman.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	private IProductService productService;
	
	@RequestMapping(value = "/index")
	public String hotProduct(HttpSession session) {
		List<Product> products = productService.findHotProduct();
		session.setAttribute("products", products);
		return "/index";
	}
}
