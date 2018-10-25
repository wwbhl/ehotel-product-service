package com.bhl.ehotel.product.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhl.ehotel.product.model.ProductProperty;
import com.bhl.ehotel.product.service.ProductPropertyService;

@RestController
@RequestMapping("/product-property")
public class ProductPropertyController {

	@Autowired
	private ProductPropertyService productPropertyService;
	
	@RequestMapping("/add") 
	@ResponseBody
	public String add(ProductProperty productProperty) {
		try {
			productPropertyService.add(productProperty);
		} catch (Exception e) {
			e.printStackTrace(); 
			return "error";
		}
		return "success";
	}
	
	@RequestMapping("/update") 
	@ResponseBody
	public String update(ProductProperty productProperty) {
		try {
			productPropertyService.update(productProperty); 
		} catch (Exception e) {
			e.printStackTrace(); 
			return "error";
		}
		return "success";
	}
	
	@RequestMapping("/delete") 
	@ResponseBody
	public String delete(Long id) {
		try {
			productPropertyService.delete(id); 
		} catch (Exception e) {
			e.printStackTrace(); 
			return "error";
		}
		return "success";
	}
	
	@RequestMapping("/findById") 
	@ResponseBody
	public ProductProperty findById(Long id){
		try {
			return productPropertyService.findById(id);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		return new ProductProperty();
	}
	
}
