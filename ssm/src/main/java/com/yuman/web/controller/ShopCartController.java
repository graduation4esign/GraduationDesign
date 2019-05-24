package com.yuman.web.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuman.bean.SShopcartItem;
import com.yuman.service.interf.IShopcartService;

@Controller
public class ShopCartController {
	@Autowired
	private IShopcartService shopcartService;
	
	@RequestMapping(value="/toshopCart")
	public String shopCart(int userId, HttpSession session) {
		System.out.println("shopCart userId:"+userId);
		List<SShopcartItem> sShopcartItems = shopcartService.findAllShopcartItem(new BigDecimal(userId));
		if (sShopcartItems ==null) {
			return "/emptyCar";
		}
		session.setAttribute("sShopcartItems", sShopcartItems);

		return "/shopCart";
	}
	
	@RequestMapping(value="/toaddshopcar", method = RequestMethod.POST)
	public String toaddShopCar(SShopcartItem item, HttpSession session) {
		System.out.println(item.getNum() + " "+ item.getProductId()+" "+item.getUserId());
		shopcartService.addItem(item);
		
		List<SShopcartItem> sShopcartItems = shopcartService.findAllShopcartItem(item.getUserId());
		session.setAttribute("sShopcartItems", sShopcartItems);
		return "/shopCart";
	}
	
	@RequestMapping(value="/todeleteshopcar",method=RequestMethod.GET)
	public String todeleteShopCar(int userId,int productId,HttpSession session) {
		shopcartService.deleteItem(new BigDecimal(productId));
		List<SShopcartItem> sShopcartItems = shopcartService.findAllShopcartItem(new BigDecimal(userId));
		if (sShopcartItems ==null) {
			return "/emptyCar";
		}
		session.setAttribute("sShopcartItems", sShopcartItems);

		return "/shopCart";
	}
	
	@RequestMapping(value="/emptyCar",method = RequestMethod.GET)
	public String emptyCar() {
		return "/emptyCar";
	}
}
