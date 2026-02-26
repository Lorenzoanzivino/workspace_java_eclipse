package com.rubricaTelefonica.service;

import java.util.List;
import com.rubricaTelefonica.entity.Rubrica;

public interface RubricaService {
		
    void registra(Rubrica r);

    Rubrica selectById(String id);
    
    List<Rubrica> selectAll();
   
    Rubrica delete(String id);
}
