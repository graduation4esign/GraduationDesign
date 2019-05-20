package com.yuman.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuman.bean.SCate;
import com.yuman.bean.SCateDetail;
import com.yuman.bean.SCateDetailExample;
import com.yuman.bean.SCateExample;
import com.yuman.dao.SCateDetailMapper;
import com.yuman.dao.SCateMapper;
import com.yuman.service.interf.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	private SCateMapper sCateMapper;

	@Autowired
	private SCateDetailMapper sCateDetailMapper;

	@Override
	public List<SCate> findAllCate() {
		SCateExample example = new SCateExample();
		example.createCriteria();
		return sCateMapper.selectByExample(example);
	}

	@Override
	public List<SCateDetail> findAllCateDetail() {
		SCateDetailExample example = new SCateDetailExample();
		return sCateDetailMapper.selectByExample(example);
	}

	@Override
	public Map<SCate, List<SCateDetail>> listCategoryDetail() {
		HashMap<SCate, List<SCateDetail>> map = new HashMap<>();
		List<SCate> cates = findAllCate();
		for (SCate cate : cates) {
			SCateDetailExample example = new SCateDetailExample();
			example.createCriteria().andCategoryIdEqualTo(cate.getId());
			List<SCateDetail> list = sCateDetailMapper.selectByExample(example);
			map.put(cate, list);
		}
		return map;
	}
}
