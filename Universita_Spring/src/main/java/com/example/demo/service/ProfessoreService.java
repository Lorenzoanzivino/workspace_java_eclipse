package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.DAOProfessoreMappa;
import com.example.demo.entity.Professore;

public class ProfessoreService {
	
	private DAOProfessoreMappa dao = new DAOProfessoreMappa();
	
	public boolean registra(Professore p) {
		return dao.insert(p);
    }
	

    public Professore cercaPerId(String id) {
        return dao.selectById(id);
    }
   
    public List<Professore> selectAll() {
        return dao.selectAll();
    }
   

    public Professore delete(String id) {
        return dao.delete(id);
    }

    public boolean updateMateria(String id, String nuovaMateria) {
        Professore p = dao.selectById(id);
        if (p == null) {
            return false;
        }
        
        p.setMateria(nuovaMateria);

        dao.delete(id);
        return dao.insert(p);
    }
}