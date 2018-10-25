package com.bhl.ehotel.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhl.ehotel.product.mapper.ProductPropertyMapper;
import com.bhl.ehotel.product.model.ProductProperty;
import com.bhl.ehotel.product.service.ProductPropertyService;

@Service
public class ProductPropertyServiceImpl implements ProductPropertyService {

	@Autowired
	private ProductPropertyMapper productPropertyMapper;
	
	public void add(ProductProperty productProperty) {
		productPropertyMapper.add(productProperty); 
	}

	public void update(ProductProperty productProperty) {
		productPropertyMapper.update(productProperty); 
	}

	public void delete(Long id) {
		productPropertyMapper.delete(id); 
	}

	public ProductProperty findById(Long id) {
		return productPropertyMapper.findById(id);
	}

}
