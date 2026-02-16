package com.spring.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/saluto")
public class HelloController {

	public HelloController() {
		System.out.println("Spring sta costruendo HelloController");
	}

	@GetMapping(path = "/mondo")
	public String salutaMondo() {
		return "Hello World!";
	}

	@GetMapping(path = "/pers")
	public String salutoPers(String nome) {
		return "Hello " + nome;
	}
}
