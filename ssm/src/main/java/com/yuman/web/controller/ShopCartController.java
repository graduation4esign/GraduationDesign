package com.yuman.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShopCartController {
	@RequestMapping(value="/shopCart",method = RequestMethod.GET)
	public String shopCart() {
		return "/shopCart";
	}
	
	@RequestMapping(value="/emptyCar",method = RequestMethod.GET)
	public String emptyCar() {
		return "/emptyCar";
	}
}
