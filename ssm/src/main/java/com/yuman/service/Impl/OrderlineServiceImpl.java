package com.yuman.service.Impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuman.bean.Orderline;
import com.yuman.bean.OrderlineExample;
import com.yuman.dao.OrderlineMapper;
import com.yuman.dao.ProductMapper;
import com.yuman.dao.SOrderMapper;
import com.yuman.service.IOrderlineService;

@Service
public class OrderlineServiceImpl implements IOrderlineService{
	
	@Autowired
	private OrderlineMapper orderlineMapper;
	
	@Autowired
	private ProductMapper ProductMapper;
	
	@Autowired
	private SOrderMapper orderMapper;
	
	@Override
	public void addOrderline(Orderline orderline) {
		orderlineMapper.insert(orderline);
	}
	
	@Override
	public List<Orderline> findOrderlineByUserId(BigDecimal id) {
		OrderlineExample example = new OrderlineExample();
		example.createCriteria().andUserIdEqualTo(id);
		List<Orderline> orderlines =orderlineMapper.selectByExample(example);
		for (Orderline orderline : orderlines) {
			orderline.setProduct(ProductMapper.selectByPrimaryKey(orderline.getProductId()));
			orderline.setOrder(orderMapper.selectByPrimaryKey(orderline.getOrderId()));
		}
		return orderlines;
		
	}

}
