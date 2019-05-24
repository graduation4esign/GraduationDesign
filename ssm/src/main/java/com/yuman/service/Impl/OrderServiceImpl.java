package com.yuman.service.Impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuman.bean.SOrder;
import com.yuman.bean.SOrderExample;
import com.yuman.dao.SOrderMapper;
import com.yuman.service.interf.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService{
	@Autowired
	private SOrderMapper orderMapper;
	
	@Override
	public List<SOrder> findAllOrder(BigDecimal userId) {
		SOrderExample example = new SOrderExample();
		example.createCriteria().andUserIdEqualTo(userId);
		return orderMapper.selectByExample(example);
	}

	@Override
	public void addOrder(SOrder order) {
		orderMapper.insert(order);
	}

	@Override
	public SOrder finOrderByOrderId(String orderId) {
		SOrderExample example = new SOrderExample();
		example.createCriteria().andOrderidEqualTo(orderId);
		return orderMapper.selectByExample(example).get(0);
	}

	@Override
	public void deleteOrderByOrderId(String orderId) {
		SOrderExample example = new SOrderExample();
		example.createCriteria().andOrderidEqualTo(orderId);
		orderMapper.deleteByExample(example);
	}

	

}
