package com.siom.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class WelcomeController {
	
	@GetMapping
	public String hello() {
		return "<h1> Welcome test today</h1>";
	}
}
