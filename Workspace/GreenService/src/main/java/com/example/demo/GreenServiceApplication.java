package com.example.demo;

import java.sql.Timestamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GreenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenServiceApplication.class, args);
	}
	 @GetMapping("/getGreenService")
		public String getGreenService() {
		 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		 return "Turned Green on at"+timestamp;
		}


}
