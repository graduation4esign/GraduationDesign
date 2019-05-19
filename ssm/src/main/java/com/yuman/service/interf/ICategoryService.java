package com.yuman.service.interf;

import java.util.List;
import java.util.Map;

import com.yuman.bean.SCate;
import com.yuman.bean.SCateDetail;

public interface ICategoryService {
	List<SCate> findAllCate();
	
	List<SCateDetail> findAllCateDetail();
	
	Map<SCate,List<SCateDetail>> listCategoryDetail();
}
