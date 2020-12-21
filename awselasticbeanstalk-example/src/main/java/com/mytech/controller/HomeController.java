package com.mytech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello Guys Welcome to AWS ElasticsBeans App.......!!!!!!";
	}
}
