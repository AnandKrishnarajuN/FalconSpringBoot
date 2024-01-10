package com.falcon.learn.falcon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FalconApplication {

	@GetMapping("/")
	public String index(){
		String message = "Step 1";
		return "Hello! Falcon!!!" + message;
	}

	public static void main(String[] args) {
		SpringApplication.run(FalconApplication.class, args);
	}

}
