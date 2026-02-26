package com.rubricaTelefonica.service;

import java.util.List;
import com.rubricaTelefonica.entity.Contatto;
import com.rubricaTelefonica.entity.Rubrica;

public interface ContattoService {
    
    void registra(Contatto c);

    Contatto selectByMatricola(String id);

    List<Rubrica> selectAll();

    Rubrica proprietarioAnnoCreazione(String id);
}
