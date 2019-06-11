package com.ford.poc.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceDiscoveryProducerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryProducerApplication.class, args);
	}
	
}
