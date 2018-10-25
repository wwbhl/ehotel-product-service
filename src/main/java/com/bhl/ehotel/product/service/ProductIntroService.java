package com.bhl.ehotel.product.service;

import com.bhl.ehotel.product.model.ProductIntro;

public interface ProductIntroService {
	
	public void add(ProductIntro productIntro);
	
	public void update(ProductIntro productIntro);
	
	public void delete(Long id);
	
	public ProductIntro findById(Long id);
	
}
