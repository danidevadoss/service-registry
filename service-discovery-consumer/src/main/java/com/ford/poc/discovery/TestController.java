package com.ford.poc.discovery;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class TestController {
	
	@Value("${app.service.producer}")
	private String producerUri;
	
	@Autowired
	private RestTemplate rest;
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String hello() {
		URI uri = UriComponentsBuilder.fromUriString(producerUri+"/test").build().toUri();
		return rest.getForObject(uri, String.class);
	}

}
