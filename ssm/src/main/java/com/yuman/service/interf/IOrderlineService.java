package com.yuman.service.interf;

import java.math.BigDecimal;
import java.util.List;

import com.yuman.bean.Orderline;

public interface IOrderlineService {
	void addOrderline(Orderline orderline);
	
	List<Orderline> findOrderlineByUserId(BigDecimal id);
}
