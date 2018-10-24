package com.bhl.ehotel.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhl.ehotel.product.mapper.ProductMapper;
import com.bhl.ehotel.product.model.Product;
import com.bhl.ehotel.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	public void add(Product product) {
		productMapper.add(product); 
	}

	public void update(Product product) {
		productMapper.update(product); 
	}

	public void delete(Long id) {
		productMapper.delete(id); 
	}

	public Product findById(Long id) {
		return productMapper.findById(id);
	}

}
