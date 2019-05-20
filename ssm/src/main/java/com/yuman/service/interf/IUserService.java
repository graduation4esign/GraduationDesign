package com.yuman.service.interf;

import com.yuman.bean.SUser;

public interface IUserService {
	SUser login(SUser user);
	
	int register(SUser user);
	
	void updateUserInfoById(SUser user);
}
