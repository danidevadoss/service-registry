package com.ford.poc.discovery;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private Log log = LogFactory.getLog(ServiceDiscoveryProducerApplication.class);
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		log.info("Entering test method");
		return  "Success";
	}

}
