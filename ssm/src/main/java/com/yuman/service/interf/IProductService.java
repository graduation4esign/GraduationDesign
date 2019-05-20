package com.yuman.service.interf;

import java.math.BigDecimal;
import java.util.List;

import com.yuman.bean.Product;

public interface IProductService {
	List<Product> findRecommendProduct();
	
	Product findProductById(BigDecimal id);
	
	void deleteProductById(BigDecimal id);

	List<Product> findAllProduct();
}
