package com.rubricaTelefonica.service;

import java.util.List;

import com.rubricaTelefonica.entity.Rubrica;

public interface RubricaService {
		
		public void registra(Rubrica r);

	    public Rubrica selectById(String id);
	    
	    public List<Rubrica> selectAll();
	   
	    public Rubrica delete(String id);
	    
	    public List<Rubrica> ();

	}