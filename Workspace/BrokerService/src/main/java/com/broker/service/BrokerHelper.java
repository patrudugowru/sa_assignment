package com.broker.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BrokerHelper {
	@Value("${red-service-url}")
	private String redServiceUrl;
	
	@Value("${green-service-url}")
	private String greanServiceUrl;
	
	@Value("${yellow-service-url}")
	private String yellowServiceUrl;
	
	public String getUrl(String color) {
		switch (color.toLowerCase()) {
		case "red":
			return redServiceUrl;

		case "green":
			return greanServiceUrl;

		case "yellow":
			return yellowServiceUrl;

		default:
			return "No service found";

		}
		}

}
