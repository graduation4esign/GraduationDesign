package com.yuman.service;

import java.math.BigDecimal;
import java.util.List;

import com.yuman.bean.SShopcartItem;

public interface IShopcartService {
	void addItem(SShopcartItem item);
	
	List<SShopcartItem> findAllShopcartItem(BigDecimal id);
	
	void deleteItem(BigDecimal productId);
}
