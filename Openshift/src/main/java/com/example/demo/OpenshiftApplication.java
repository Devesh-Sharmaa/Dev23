package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftApplication {

	@GetMapping("/")
	public String hello() {
		return "Hello This is first Openshift program";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}

}
