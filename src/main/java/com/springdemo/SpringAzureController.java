package com.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAzureController {

	@GetMapping("/message")
	public String message() {
		return "Congrats Your Application is Deployed in Azure Platform!";
	}
}
