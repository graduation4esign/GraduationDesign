package com.yuman.web.controller;

import java.math.BigDecimal;
import java.text.Format;
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
import com.yuman.bean.SOrder;
import com.yuman.service.IOrderService;
import com.yuman.service.IOrderlineService;
import com.yuman.service.IProductService;
import com.yuman.service.IShopcartService;

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
	
	@RequestMapping(value = "/toconfirm")
	public String order(HttpSession session) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String orderid = format.format(date);
		session.setAttribute("orderid", orderid);
		return "/confirm";
	}
	
	@RequestMapping(value = "/toaddorder", method = RequestMethod.POST)
	public String orderInfo(SOrder order,int productId) {
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
		orderlineService.addOrderline(orderline);
		
		return "/confirm";
	}
	
	@RequestMapping(value = "/comfirmList")
	public String comfirmList(int userId, HttpSession session) {
		List<SOrder> orders = orderService.findAllOrder(new BigDecimal(userId));
		
		session.setAttribute("orders", orders);
		return "/comfirmList";
	}
}
