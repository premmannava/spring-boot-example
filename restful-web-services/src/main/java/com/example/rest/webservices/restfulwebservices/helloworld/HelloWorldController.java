package com.example.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{
	@GetMapping("/hello-world")
	public String hello() {
		return "Hello Prem Maannava";
	}
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello from bean");
	}
	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean pathVariableExample( @PathVariable String name) {
		return new HelloWorldBean("Hello "+name);
	}
}