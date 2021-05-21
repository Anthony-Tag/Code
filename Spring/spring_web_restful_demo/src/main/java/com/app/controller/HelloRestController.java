package com.app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class HelloRestController {
	
	@GetMapping("/")
	public String helloGet() {
		return "Hello from GET mapping.....";
	}
	
	@PostMapping("/")
	public String helloPost() {
		return "Hello from Post mapping.....";
	}
	
	@PutMapping("/")
	public String helloPut() {
		return "Hello from PUT mapping.....";
	}
	
	@DeleteMapping("/")
	public String helloDelete() {
		return "Hello from DELETE mapping.....";
	}
}
