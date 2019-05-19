package com.yuman.service;

import java.math.BigDecimal;
import java.util.List;

import com.yuman.bean.SOrder;

public interface IOrderService {
	List<SOrder> findAllOrder(BigDecimal userId);
	void addOrder( SOrder order);
	
	SOrder finOrderByOrderId(String orderId);
}
