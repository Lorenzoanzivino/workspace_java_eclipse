package com.example.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.entity.Studente;

public class DAOStudenteMappa {

    private Map<String, Studente> mappa = new HashMap<>();

    
    public boolean insert(Studente s) {
        if (mappa.containsKey(s.getMatricola())) {
            return false;
        }
        mappa.put(s.getMatricola(), s);
        return true;
    }

    public Studente selectByMatricola(String matricola) {
        return mappa.get(matricola);
    }
   
    public List<Studente> selectAll() {
        return new ArrayList<>(mappa.values());
    }
   

    public Studente delete(String matricola) {
        return mappa.remove(matricola);
    }
    

}