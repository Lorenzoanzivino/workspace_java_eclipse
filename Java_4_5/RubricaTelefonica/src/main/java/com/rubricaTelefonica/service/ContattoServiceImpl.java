package com.rubricaTelefonica.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.rubricaTelefonica.entity.Contatto;
import com.rubricaTelefonica.entity.Rubrica;

@Service
public class ContattoServiceImpl implements ContattoService {

    @Override
    public void registra(Contatto c) {
        // implementazione
    }

    @Override
    public Contatto selectByMatricola(String id) {
        return null; // implementazione
    }

    @Override
    public List<Rubrica> selectAll() {
        return null; // implementazione
    }

    @Override
    public Rubrica proprietarioAnnoCreazione(String id) {
        return null; // implementazione
    }
}
