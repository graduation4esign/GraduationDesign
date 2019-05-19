package com.yuman.web.controller;

import java.math.BigDecimal;
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
	
	@RequestMapping(value = "/toproductInfo")
	public String hotProduct(int productId, HttpSession session) {
		Product productInfo = productService.findProductById(new BigDecimal(productId));
		System.out.println(productInfo.getId());
		session.setAttribute("productInfo", productInfo);
		return "/productInfo";
	}
}
