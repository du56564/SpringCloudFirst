package com.bofa.microservices.limitservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bofa.microservices.limitservices.bean.LimitConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuraion;
	
	@GetMapping("limits")
	public LimitConfiguration retrieveLimitConfigurations() {
		return new LimitConfiguration(configuraion.getMinimum(), configuraion.getMaximum());
	}
	
	@GetMapping("falult-tolerance-example")
	@HystrixCommand(fallbackMethod="fallbackRetrieveConfigurations")
	public LimitConfiguration retrieveLimitFromConfigurations() {
		throw new RuntimeException("Not Available");
	}
	
	public LimitConfiguration fallbackRetrieveConfigurations() {
		return new LimitConfiguration(9, 99);
	}
	
}
