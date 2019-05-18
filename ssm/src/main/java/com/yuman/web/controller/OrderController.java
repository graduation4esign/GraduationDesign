package com.yuman.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yuman.bean.SOrder;
import com.yuman.service.IOrderService;

@Controller
public class OrderController {
	@Autowired
	private IOrderService orderService;
	
	@RequestMapping(value = "/order")
	public String order(HttpSession session) {
		List<SOrder> orders = orderService.findAllOrder();
		session.setAttribute("orders", orders);
		return "/order";
	}
}
