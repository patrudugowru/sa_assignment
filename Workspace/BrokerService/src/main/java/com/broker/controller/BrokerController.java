package com.broker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.broker.service.BrokerHelper;

@RestController
public class BrokerController {
	@Autowired
	BrokerHelper brokerHelper;
	
	@GetMapping("/broker-service/{color}")
	public String getEndpoint(@PathVariable("color") String color) {
		return brokerHelper.getUrl(color);
	}
	
	@GetMapping("/fetchUrl")
	public String fetchUrl() {
		return"valid hit";
	}
}

