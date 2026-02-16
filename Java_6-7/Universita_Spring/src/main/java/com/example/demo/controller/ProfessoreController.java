package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Professore;
import com.example.demo.service.ProfessoreService;

@RestController
@RequestMapping(path="/studenti", produces = "application/json")
public class ProfessoreController {
	
	private ProfessoreService service = new ProfessoreService();
	
	@PostMapping(path="/registra", consumes = "application/json")
	public boolean registra(@RequestBody Professore p ) {
		return service.registra(p);
	}
	
	@GetMapping(path="/cercaPerId/{id}")
	public Professore cercaPerId(@PathVariable String id) {
		return service.cercaPerId(id);
	}
	
	@GetMapping(path="/selectAll")
	public List<Professore> selectAll(){
		return service.selectAll();
	}
	
	@DeleteMapping(path="/delete/{id}")
	public Professore delete(@PathVariable String id) {
		return service.delete(id);
	}
	
	@PatchMapping(path="/updateIndirizzo/{id}", consumes = "application/json")
	public boolean updateMateria(@PathVariable String id, String materia) {
		return service.updateMateria(id, materia);
	}

}