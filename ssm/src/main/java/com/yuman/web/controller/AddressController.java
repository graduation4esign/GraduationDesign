package com.yuman.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuman.bean.SAddress;

@Controller
public class AddressController {
	@RequestMapping(value = "/toaddress", method = RequestMethod.POST)
	public void addAddress(SAddress address) {
		System.out.println(address);
	}
}
