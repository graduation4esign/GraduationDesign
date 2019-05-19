package com.yuman.web.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuman.bean.SShopcartItem;
import com.yuman.service.IShopcartService;

@Controller
public class ShopCartController {
	@Autowired
	private IShopcartService shopcartService;
	
	@RequestMapping(value="/shopCart")
	public String shopCart(int userId, HttpSession session) {
		System.out.println("shopCart userId:"+userId);
		List<SShopcartItem> sShopcartItems = shopcartService.findAllShopcartItem(new BigDecimal(userId));
		session.setAttribute("sShopcartItems", sShopcartItems);

		return "/shopCart";
	}
	
	@RequestMapping(value="/toaddshopcar", method = RequestMethod.POST)
	public String toaddShopCar(SShopcartItem item) {
		System.out.println(item.getNum() + " "+ item.getProductId()+" "+item.getUserId());
		shopcartService.addItem(item);
		return "/shopCart";
	}
	
	@RequestMapping(value="/emptyCar",method = RequestMethod.GET)
	public String emptyCar() {
		return "/emptyCar";
	}
}
