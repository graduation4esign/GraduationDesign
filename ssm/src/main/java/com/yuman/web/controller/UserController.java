package com.yuman.web.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuman.bean.SUser;
import com.yuman.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(SUser user, HttpSession session) {
		if (userService.login(user)) {
			session.setAttribute("user", user);
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
}
