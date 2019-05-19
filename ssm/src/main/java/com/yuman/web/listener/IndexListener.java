package com.yuman.web.listener;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.yuman.bean.Product;
import com.yuman.bean.SCate;
import com.yuman.bean.SCateDetail;
import com.yuman.service.Impl.CategoryServiceImpl;
import com.yuman.service.Impl.ProductServiceImpl;

public class IndexListener implements ServletContextListener,HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		CategoryServiceImpl categoryServiceImpl = new CategoryServiceImpl();
		ProductServiceImpl productServiceImpl = new ProductServiceImpl();
		//获取一级菜单和一级菜单下对应的二级菜单
		Map<SCate, List<SCateDetail>> categorys = categoryServiceImpl.listCategoryDetail();
		//获取所有商品
		List<Product> products = productServiceImpl.findAllProduct();
		//把它们都存放到application中
		ServletContext application = arg0.getServletContext();
		application.setAttribute("categorys", categorys);
		application.setAttribute("products", products);
	}

}
