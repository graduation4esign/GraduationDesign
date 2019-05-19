package com.yuman.service.Impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuman.bean.ProductExample;
import com.yuman.bean.SShopcartItem;
import com.yuman.bean.SShopcartItemExample;
import com.yuman.dao.ProductMapper;
import com.yuman.dao.SShopcartItemMapper;
import com.yuman.service.interf.IShopcartService;

@Service
public class ShopcartServiceImpl implements IShopcartService{
	@Autowired
	private SShopcartItemMapper shopcartMapper;
	
	@Autowired
	private ProductMapper productMapper;

	@Override
	public void addItem(SShopcartItem item) {
		shopcartMapper.insert(item);
	}

	@Override
	public List<SShopcartItem> findAllShopcartItem(BigDecimal id) {
		SShopcartItemExample example = new SShopcartItemExample();
		example.createCriteria().andUserIdEqualTo(id).andProductIdIsNotNull().andNumIsNotNull();
		List<SShopcartItem> shopcartItems = shopcartMapper.selectByExample(example);
		for (SShopcartItem sShopcartItem : shopcartItems) {
			sShopcartItem.setProduct(productMapper.selectByPrimaryKey(sShopcartItem.getProductId()));
		}
		return shopcartItems;
	}

	@Override
	public void deleteItem(BigDecimal productId) {
		SShopcartItemExample example = new SShopcartItemExample();
		example.createCriteria().andProductIdEqualTo(productId);
		shopcartMapper.deleteByExample(example);
	}

}
