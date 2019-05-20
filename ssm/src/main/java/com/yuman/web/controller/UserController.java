package com.yuman.web.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuman.bean.Product;
import com.yuman.bean.SCate;
import com.yuman.bean.SCateDetail;
import com.yuman.bean.SUser;
import com.yuman.service.Impl.CategoryServiceImpl;
import com.yuman.service.Impl.ProductServiceImpl;
import com.yuman.service.interf.ICategoryService;
import com.yuman.service.interf.IProductService;
import com.yuman.service.interf.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;

	@Autowired
	private IProductService productService;

	@Autowired
	private ICategoryService categoryService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(SUser user, HttpSession session) {
		SUser findUser = userService.login(user);
		if ( findUser != null) {
			System.out.println(user.getDob()+"date");
			session.setAttribute("user", findUser);
			System.out.println("userId:"+findUser.getId());
			List<Product> products = productService.findRecommendProduct();
			System.out.println(products.get(0).getName());
			session.setAttribute("isSuccess", true);
			session.setAttribute("products", products);


			return "/indexSuccess";
		}
		return "/login";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerPage() {
		return "/register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(SUser user, HttpSession session) {
		user.setDob(new Date());
		int i = userService.register(user);
		if (i == 1) {
			session.setAttribute("user", user);
			return "/indexSuccess";
		}
		return "/register";
	}

	@RequestMapping(value = "/")
	public String index(HttpSession session, HttpServletRequest request) {
		session.setAttribute("isSuccess", false);
		session.setAttribute("user", null);
		session.setAttribute("products", null);
		Map<SCate, List<SCateDetail>> categorys = categoryService.listCategoryDetail();
		List<Product> hotProducts = productService.findAllProduct();
		ServletContext application = request.getSession().getServletContext();
		application.setAttribute("categorys", categorys);
		application.setAttribute("hotProducts", hotProducts);
		return "/indexSuccess";
	}

	@RequestMapping(value = "/userinfo", method = RequestMethod.GET)
	public String userInfo() {
		return "/userinfo";
	}

	@RequestMapping(value = "/userinfo", method = RequestMethod.POST)
	public String userInfoUpdate(SUser user) {

		userService.updateUserInfoById(user);
		System.out.println(user);
		return "/userinfo";
	}
	
	@RequestMapping(value = "/receiveAddress", method = RequestMethod.GET)
	public String receiveAddress() {
		return "/receiveAddress";
	}
	
}
