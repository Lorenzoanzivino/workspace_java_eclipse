package com.spring.utenti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.utenti.entity.Utente;
import com.spring.utenti.service.UtenteService;

@RestController
@RequestMapping(path="/utenti")
public class UtenteController {
	
	@Autowired
	private UtenteService service;
	
	@GetMapping(path="/registra", consumes = "application/json")
	public boolean registra(@RequestBody Utente utente) {
		return service.registra(utente);
	}
	
	@GetMapping(path="/selectALl", produces = "application/json" )
	public List<Utente> selectAll() {
		return service.selectAll();
	}
	
	@GetMapping(path="/cercaPerId/{idUtente}", produces = "application/json" )
	public Utente cercaPerId(@PathVariable int idUtente) {
		return service.cercaPerId(idUtente);
	}
	
	@DeleteMapping(path="/delete/{idUtente}", produces = "application/json")
	public Utente delete(@PathVariable int idUtente) {
		return service.delete(idUtente);
	}
	
	@PatchMapping(path="/cambiaMail/{idUtente}", produces = "application/json")
	public Utente cambiaMail(@PathVariable int idUtente, String mail) {
		return service.cambiaMail(idUtente, mail);
	}
	
	@GetMapping(path = "/count", produces = "application/json")
	public int getNumeroUtenti() {
	    return service.getNumeroUtenti();
	}
	
	@GetMapping(path = "/cercaNome/{nome}", produces = "application/json")
	public List<Utente> getNomiUtenti(@PathVariable String nome) {
	    return service.getNomiUtenti(nome);
	}
	
	@GetMapping(path = "/cercaNomeSingolo/{nome}", produces = "application/json")
	public Utente cercaNome(@PathVariable String nome) {
	    return service.cercaNome(nome);
	}

}
