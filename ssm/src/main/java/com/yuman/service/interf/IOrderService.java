package com.yuman.service.interf;

import java.math.BigDecimal;
import java.util.List;

import org.ietf.jgss.Oid;

import com.yuman.bean.SOrder;

public interface IOrderService {
	List<SOrder> findAllOrder(BigDecimal userId);
	void addOrder( SOrder order);
	
	SOrder finOrderByOrderId(String orderId);
	
	void deleteOrderByOrderId(String orderId);
}
