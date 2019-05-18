package com.yuman.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuman.bean.SUser;
import com.yuman.bean.SUserExample;
import com.yuman.dao.SUserMapper;
import com.yuman.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private SUserMapper userMapper;
	
	@Override
	public boolean login(SUser user) {
		SUserExample example = new SUserExample();
		example.createCriteria().andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
		List<SUser> users = userMapper.selectByExample(example);
		SUser returnUser = users.get(0);
		if (returnUser != null) {
			return true;
		}
		return false;
	}

	@Override
	public int register(SUser user) {
		return userMapper.insert(user);
	}

}
