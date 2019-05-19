package com.yuman.service;

import java.math.BigDecimal;
import java.util.List;

import com.yuman.bean.Orderline;

public interface IOrderlineService {
	void addOrderline(Orderline orderline);
	
	List<Orderline> findOrderlineByOrderId(BigDecimal id);
}
