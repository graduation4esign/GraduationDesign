package com.yuman.service;

import com.yuman.bean.SUser;

public interface IUserService {
	SUser login(SUser user);
	
	int register(SUser user);
}
