package com.yuman.service;

import java.math.BigDecimal;
import java.util.List;

import com.yuman.bean.Product;

public interface IProductService {
	List<Product> findHotProduct();
	
	Product findProductById(BigDecimal id);
	
	void deleteProductById(BigDecimal id);
}
