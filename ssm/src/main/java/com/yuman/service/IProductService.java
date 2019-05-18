package com.yuman.service;

import java.util.List;

import com.yuman.bean.Product;

public interface IProductService {
	List<Product> findHotProduct();
}
