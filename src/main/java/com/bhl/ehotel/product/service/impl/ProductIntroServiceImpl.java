package com.bhl.ehotel.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhl.ehotel.product.mapper.ProductIntroMapper;
import com.bhl.ehotel.product.model.ProductIntro;
import com.bhl.ehotel.product.service.ProductIntroService;

@Service
public class ProductIntroServiceImpl implements ProductIntroService {

	@Autowired
	private ProductIntroMapper productIntroMapper;
	
	public void add(ProductIntro productIntro) {
		productIntroMapper.add(productIntro); 
	}

	public void update(ProductIntro productIntro) {
		productIntroMapper.update(productIntro); 
	}

	public void delete(Long id) {
		productIntroMapper.delete(id); 
	}

	public ProductIntro findById(Long id) {
		return productIntroMapper.findById(id);
	}

}
