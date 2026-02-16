package com.spring.utenti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.utenti.dao.DAOUtenteMappa;
import com.spring.utenti.entity.Utente;

@Service
public class UtenteService {
	
	@Autowired
	private DAOUtenteMappa dao;
	
	public UtenteService() {
		
	}
	
	public boolean registra(Utente utente) {
		return dao.insert(utente);
	}
	
	public List<Utente> selectAll() {
		return dao.selectAll();
	}
	
	public Utente cercaPerId(int idUtente) {
		return dao.selectById(idUtente);
	}
	
	public Utente delete(int idUtente) {
		return dao.delete(idUtente);
	}
	
	public Utente cambiaMail(int idUtente, String mail) {
	Utente u = dao.selectById(idUtente);
	if (u != null) {
		u.setMail(mail);
	}return u;
	}
	
	public int getNumeroUtenti(){
		return dao.selectAll().size();
	}
	
	public List<Utente> getNomiUtenti(String nome){
		return dao.selectAll();
	}
	
	public Utente cercaNome(String nome) {
	    for (Utente u : dao.selectAll()) {
	        if (u.getNome().equalsIgnoreCase(nome)) {
	            return u;
	        }
	    }
	    return null;
	}
}
