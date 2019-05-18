package com.yuman.service.Impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuman.bean.Product;
import com.yuman.bean.ProductExample;
import com.yuman.dao.ProductMapper;
import com.yuman.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	private ProductMapper productMapper;
	@Override
	public List<Product> findHotProduct() {
		ProductExample example = new ProductExample();
		example.createCriteria();
		List<Product> products = productMapper.selectByExample(example);
//		products.sort(Comparator.naturalOrder()); //从小到大排序
		products.sort(Comparator.reverseOrder()); //从大到小排序
		List<Product> list = new ArrayList<>();
		int i = 0;
		for (Product product : products) {
			if (i == 5) {
				break;
			}
			list.add(product);
			i++;
		}
		return list;
	}

}
