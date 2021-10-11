package com.example.Hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@Value("${NAME}")
    private String name;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/hello")
	String getResponse() {
		
		return "Hello "+name;
	}
	
	
}
