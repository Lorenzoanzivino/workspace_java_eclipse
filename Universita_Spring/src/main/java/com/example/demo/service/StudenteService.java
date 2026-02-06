package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.DAOStudenteMappa;
import com.example.demo.entity.Studente;

public class StudenteService {
	
	private DAOStudenteMappa dao = new DAOStudenteMappa();
	
	public boolean registra(Studente s) {
		return dao.insert(s);
    }
	

    public Studente selectByMatricola(String matricola) {
        return dao.selectByMatricola(matricola);
    }
   
    public List<Studente> selectAll() {
        return dao.selectAll();
    }
   

    public Studente delete(String matricola) {
        return dao.delete(matricola);
    }

    public boolean updateIndirizzo(String matricola, String nuovoIndirizzo) {
        Studente s = dao.selectByMatricola(matricola);
        if (s == null) {
            return false;
        }
        
        s.setIndirizzo(nuovoIndirizzo);

        dao.delete(matricola);
        return dao.insert(s);
    }
}
