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

@Deprecated
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
		//��ȡһ���˵���һ���˵��¶�Ӧ�Ķ����˵�
		Map<SCate, List<SCateDetail>> categorys = categoryServiceImpl.listCategoryDetail();
		//��ȡ������Ʒ
		List<Product> products = productServiceImpl.findAllProduct();
		//�����Ƕ���ŵ�application��
		ServletContext application = arg0.getServletContext();
		application.setAttribute("categorys", categorys);
		application.setAttribute("products", products);
	}

}
