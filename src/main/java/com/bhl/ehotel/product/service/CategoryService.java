package com.bhl.ehotel.product.service;

import com.bhl.ehotel.product.model.Category;

public interface CategoryService {
	
	public void add(Category category);
	
	public void update(Category category);
	
	public void delete(Long id);
	
	public Category findById(Long id);
	
}
