package com.yuman.service.Impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuman.bean.Orderline;
import com.yuman.bean.OrderlineExample;
import com.yuman.dao.OrderlineMapper;
import com.yuman.service.IOrderlineService;

@Service
public class OrderlineServiceImpl implements IOrderlineService{
	
	@Autowired
	private OrderlineMapper orderlineMapper;
	@Override
	public void addOrderline(Orderline orderline) {
		orderlineMapper.insert(orderline);
	}
	
	@Override
	public List<Orderline> findOrderlineByOrderId(BigDecimal id) {
		OrderlineExample example = new OrderlineExample();
		example.createCriteria().andOrderIdEqualTo(id);
		return orderlineMapper.selectByExample(example);
		
	}

}
