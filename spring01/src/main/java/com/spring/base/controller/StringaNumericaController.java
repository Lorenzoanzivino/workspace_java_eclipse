package com.spring.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/testo")
public class StringaNumericaController {
	public StringaNumericaController() {
		System.out.println("Spring sta costruendo StringaNumericaController");
	}

	@GetMapping("/numerico")
	public String verificaNumero(String numero) {
		if (numero == null || numero.isEmpty()) {
			return "testo NON numerico";
		}

		for (int i = 0; i < numero.length(); i++) {
			char c = numero.charAt(i);
			if (c < '0' || c > '9') {
				return "testo NON numerico";
			}
		}

		return "testo numerico";
	}
}
