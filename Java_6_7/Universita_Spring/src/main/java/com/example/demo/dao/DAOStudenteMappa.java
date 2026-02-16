package com.example.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.entity.Studente;

public class DAOStudenteMappa {

    private Map<String, Studente> mappa = new HashMap<>();

    
    public void insert(Studente s) {
    	if(s == null) {
    		throw new RuntimeException("Studente nullo");
    	}else if(s.getMatricola()== null) {
    		throw new RuntimeException("Matricola Nulla");
    	}else if (mappa.containsKey(s.getMatricola())) {
            throw new RuntimeException("Studente già presente con matricola: " + s.getMatricola());
        }
        mappa.put(s.getMatricola(), s);
    }

    public Studente selectByMatricola(String matricola) {
        if (matricola == null) {
        	throw new RuntimeException("Matricola nulla");
        }return mappa.get(matricola);
    }
   
    public List<Studente> selectAll() {
        return new ArrayList<>(mappa.values());
    }
   

    public Studente delete(String matricola) {
    	if (matricola == null) {
        	throw new RuntimeException("Matricola nulla");
    	}return mappa.remove(matricola);
    }
    

}