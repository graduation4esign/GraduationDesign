package com.yuman.web.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuman.bean.Orderline;
import com.yuman.bean.Product;
import com.yuman.bean.SAddress;
import com.yuman.bean.SOrder;
import com.yuman.service.interf.IAddressService;
import com.yuman.service.interf.IOrderService;
import com.yuman.service.interf.IOrderlineService;
import com.yuman.service.interf.IProductService;
import com.yuman.service.interf.IShopcartService;

@Controller
public class OrderController {
	@Autowired
	private IOrderService orderService;
	
	@Autowired
	private IShopcartService shopcartService;
	
	@Autowired 
	private IOrderlineService orderlineService;
	
	@Autowired
	private IProductService productService;
	
	@Autowired
	private IAddressService addressService;
	
	@RequestMapping(value = "/toconfirm")
	public String order(HttpSession session) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String orderid = format.format(date);
		session.setAttribute("orderid", orderid);
		return "/confirm";
	}
	
	@RequestMapping(value = "/toaddorder", method = RequestMethod.POST)
	public String orderInfo(SOrder order, int productId,HttpSession session) {
		System.out.println("productId:"+productId);
		order.setPaystatus(new BigDecimal(0));
		order.setDob(new Date());
		orderService.addOrder(order);
		
		SOrder findOrder = orderService.finOrderByOrderId(order.getOrderid());
		
		shopcartService.deleteItem(new BigDecimal(productId));
		Product product = productService.findProductById(new BigDecimal(productId));
		Orderline orderline = new Orderline();
		orderline.setNum(product.getRemain());
		orderline.setOrderId(findOrder.getId());
		orderline.setProductId(new BigDecimal(productId));
		orderline.setUserId(findOrder.getUserId());
		orderlineService.addOrderline(orderline);
		
		List<SAddress> allAddress = addressService.findAllAddress(findOrder.getUserId());
		session.setAttribute("addresses", allAddress);
		return "/submitOrder";
	}
	
	@RequestMapping(value = "/confirmSuccess", method = RequestMethod.POST)
	public String confirmSuccess(SAddress address, int userId) {
		address.setUserId(new BigDecimal(userId));
		System.out.println(address);
		addressService.addAddress(address);
		return "/confirmSuccess";
	}
	
	@RequestMapping(value = "/confirmList")
	public String confirmList(int userId, HttpSession session) {
		List<Orderline> orderlines = orderlineService.findOrderlineByUserId(new BigDecimal(userId));
		session.setAttribute("orderlines", orderlines);
		return "/confirmList";
	}
	
	@RequestMapping(value="/todelorder")
	public String delorder(String orderId) {
		orderService.deleteOrderByOrderId(orderId);
		return"";
	}
}
