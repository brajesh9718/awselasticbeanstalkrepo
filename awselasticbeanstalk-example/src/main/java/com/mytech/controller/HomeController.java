package com.mytech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String sayHello() {
		return "Let me Change this .......!!!!!!";
	}
}
