package com.yuman.service.Impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuman.bean.Product;
import com.yuman.bean.ProductExample;
import com.yuman.dao.ProductMapper;
import com.yuman.service.interf.IProductService;

@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	private ProductMapper productMapper;
	@Override
	public List<Product> findRecommendProduct() {
		ProductExample example = new ProductExample();
		example.createCriteria();
		List<Product> products = productMapper.selectByExample(example);
		//��С����
//		products.sort(Comparator.naturalOrder()); 
		//�Ӵ�С
		products.sort(Comparator.reverseOrder()); 
		List<Product> list = new ArrayList<>();
		int i = 0;
		for (Product product : products) {
			if (i == 3) {
				break;
			}
			list.add(product);
			i++;
		}
		return list;
	}
	@Override
	public Product findProductById(BigDecimal id) {
		return productMapper.selectByPrimaryKey(id);
	}
	@Override
	public void deleteProductById(BigDecimal id) {
		productMapper.deleteByPrimaryKey(id);
		
	}
	
	@Override
	public List<Product> findAllProduct(){
		ProductExample example = new ProductExample();
		example.createCriteria();
		List<Product> products = productMapper.selectByExample(example);
		return products;
	}

}
