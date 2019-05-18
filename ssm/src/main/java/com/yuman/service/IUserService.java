package com.yuman.service;

import com.yuman.bean.SUser;

public interface IUserService {
	boolean login(SUser user);
	
	int register(SUser user);
}
