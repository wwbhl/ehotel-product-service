package com.bhl.ehotel.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhl.ehotel.product.mapper.CategoryMapper;
import com.bhl.ehotel.product.model.Category;
import com.bhl.ehotel.product.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;
	
	public void add(Category category) {
		categoryMapper.add(category); 
	}

	public void update(Category category) {
		categoryMapper.update(category); 
	}

	public void delete(Long id) {
		categoryMapper.delete(id); 
	}

	public Category findById(Long id) {
		return categoryMapper.findById(id);
	}

}
