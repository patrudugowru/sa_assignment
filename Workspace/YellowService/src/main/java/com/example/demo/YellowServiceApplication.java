package com.example.demo;

import java.sql.Timestamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class YellowServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(YellowServiceApplication.class, args);
	}

	 @GetMapping("/getYellowService")
		public String getYellowService() {
		 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			return "Turned Yellow on at"+timestamp;
		}

}
