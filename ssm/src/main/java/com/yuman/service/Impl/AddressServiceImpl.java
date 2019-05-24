package com.yuman.service.Impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuman.bean.SAddress;
import com.yuman.bean.SAddressExample;
import com.yuman.dao.SAddressMapper;
import com.yuman.service.interf.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService{
	@Autowired
	private SAddressMapper addressMapper;
	@Override
	public void addAddress(SAddress address) {
		addressMapper.insert(address);
	}

	@Override
	public void updateAddress(SAddress address) {
		addressMapper.updateByPrimaryKey(address);
	}

	@Override
	public SAddress findAddress(BigDecimal userId) {
		SAddressExample example = new SAddressExample();
		example.createCriteria().andUserIdEqualTo(userId);
		List<SAddress> addresses = addressMapper.selectByExample(example);
		return addresses.get(0);
	}

	@Override
	public List<SAddress> findAllAddress(BigDecimal userId) {
		SAddressExample example = new SAddressExample();
		example.createCriteria().andUserIdEqualTo(userId);
		List<SAddress> addresses = addressMapper.selectByExample(example);
		return addresses;
	}
	
}
