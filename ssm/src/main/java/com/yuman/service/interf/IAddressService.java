package com.yuman.service.interf;

import java.math.BigDecimal;
import java.util.List;

import com.yuman.bean.SAddress;


public interface IAddressService {
	void addAddress(SAddress address);
	
	void updateAddress(SAddress address);
	
	SAddress findAddress(BigDecimal userId);
	
	List<SAddress> findAllAddress(BigDecimal userId);
}
