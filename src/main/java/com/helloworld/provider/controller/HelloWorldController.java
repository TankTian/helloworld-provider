package com.helloworld.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/hello/{name}")
	public String index(@PathVariable String name) {
		return "hello!" + name;
	}
}
