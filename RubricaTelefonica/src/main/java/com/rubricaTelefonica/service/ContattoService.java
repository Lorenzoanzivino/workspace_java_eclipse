package com.rubricaTelefonica.service;

import java.util.List;

import com.rubricaTelefonica.entity.Contatto;

public abstract class ContattoService {
	
	public void registra(Contatto c);

    public Contatto selectByMatricola(String id);
    
    public List<Rubrica> selectAll();
   
    public Rubrica proprietarioAnnoCreazione(String id);
}
}
