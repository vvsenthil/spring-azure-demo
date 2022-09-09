package com.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAzureController {

	@GetMapping("")
	public String message() {
		return "Congrats Your Application Deployed in Azure !";
	}
}
