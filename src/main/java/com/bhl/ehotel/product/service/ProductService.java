package com.bhl.ehotel.product.service;

import com.bhl.ehotel.product.model.Product;

public interface ProductService {
	
	public void add(Product product);
	
	public void update(Product product);
	
	public void delete(Long id);
	
	public Product findById(Long id);
	
}
