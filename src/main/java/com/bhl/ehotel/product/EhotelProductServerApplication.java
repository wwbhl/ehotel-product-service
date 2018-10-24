package com.bhl.ehotel.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EhotelProductServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhotelProductServerApplication.class, args); 
	}
}
