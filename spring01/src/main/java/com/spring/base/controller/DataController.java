package com.spring.base.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/data")
@RestController
public class DataController {

	@GetMapping(path = "/oggi")
	public LocalDate getToday() {
		return LocalDate.now();
	}

	@GetMapping(path = "/pers")
	public LocalDate getData(int anno, int mese, int giorno) {
		return LocalDate.of(anno, mese, giorno);
	}
}
