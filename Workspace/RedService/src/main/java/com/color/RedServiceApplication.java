package com.color;

import java.sql.Timestamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RedServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedServiceApplication.class, args);
	}

	 @GetMapping("/getRedService")
		public String getRedService() {
			 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			 return "Turned Red on at"+timestamp;
		}

}
