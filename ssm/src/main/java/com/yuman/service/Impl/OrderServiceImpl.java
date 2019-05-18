package com.yuman.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuman.bean.SOrder;
import com.yuman.bean.SOrderExample;
import com.yuman.dao.SOrderMapper;
import com.yuman.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService{
	@Autowired
	private SOrderMapper orderMapper;
	
	@Override
	public List<SOrder> findAllOrder() {
		SOrderExample example = new SOrderExample();
		example.createCriteria();
		return orderMapper.selectByExample(example);
	}

}
