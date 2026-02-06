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
import com.example.demo.entity.Studente;
import com.example.demo.service.StudenteService;

@RestController
@RequestMapping(path="/studenti", produces = "application/json")
public class StudenteController {
	
	private StudenteService service = new StudenteService();
	
	@PostMapping(path="/registra", consumes = "application/json")
	public boolean registra(@RequestBody Studente s) {
		return service.registra(s);
	}
	
	@GetMapping(path="/selectByMatricola/{matricola}")
	public Studente selcetByMatricola(@PathVariable String matricola) {
		return service.selectByMatricola(matricola);
	}
	
	@GetMapping(path="/selectAll")
	public List<Studente> selectAll(){
		return service.selectAll();
	}
	
	@DeleteMapping(path="/delete/{matricola}")
	public Studente delete(@PathVariable String matricola) {
		return service.delete(matricola);
	}
	
	@PatchMapping(path="/updateIndirizzo/{matricola}", consumes = "application/json")
	public boolean updateIndirizzo(@PathVariable String matricola, String indirizzo) {
		return service.updateIndirizzo(matricola, indirizzo);
	}

}
