package com.bhl.ehotel.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhl.ehotel.product.mapper.ProductIntroMapper;
import com.bhl.ehotel.product.model.ProductIntro;
import com.bhl.ehotel.product.rabbitmq.RabbitMQSender;
import com.bhl.ehotel.product.rabbitmq.RabbitQueue;
import com.bhl.ehotel.product.service.ProductIntroService;

@Service
public class ProductIntroServiceImpl implements ProductIntroService {

	@Autowired
	private ProductIntroMapper productIntroMapper;
	
	@Autowired
	private RabbitMQSender rabbitMQSender;
	
	public void add(ProductIntro productIntro) {
		productIntroMapper.add(productIntro); 
		rabbitMQSender.send(RabbitQueue.DATA_CHANGE_QUEUE, "{\"event_type\": \"add\", \"data_type\": \"product_intro\", \"id\": " + productIntro.getId() + "}");
	}

	public void update(ProductIntro productIntro) {
		productIntroMapper.update(productIntro); 
		rabbitMQSender.send(RabbitQueue.DATA_CHANGE_QUEUE, "{\"event_type\": \"update\", \"data_type\": \"product_intro\", \"id\": " + productIntro.getId() + "}");
	}

	public void delete(Long id) {
		productIntroMapper.delete(id); 
		rabbitMQSender.send(RabbitQueue.DATA_CHANGE_QUEUE, "{\"event_type\": \"delete\", \"data_type\": \"product_intro\", \"id\": " + id + "}");
	}

	public ProductIntro findById(Long id) {
		return productIntroMapper.findById(id);
	}

}
