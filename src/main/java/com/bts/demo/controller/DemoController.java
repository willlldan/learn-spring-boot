package com.bts.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/")
public class DemoController {
	
//	@GetMapping
	public String welcome() {
		return "Hello World";
	}
	
//	@PostMapping
	public String show() {
		return "This is @PostMapping";
	}
}
