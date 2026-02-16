package com.rubricaTelefonica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubricaTelefonica.dao.DAORubrica;
import com.rubricaTelefonica.entity.Rubrica;

@Service
public class RubricaServiceImpl implements RubricaService{
	
	@Autowired
	DAORubrica dao;
	
	public void registra(Rubrica r) {
		dao.insert(r);
    }
	

    public Rubrica selectById(String id) {
        return dao.selectById(id);
    }
   
    public List<Rubrica> selectAll() {
        return dao.selectAll();
    }
   

    public Rubrica delete(String id) {
        return dao.delete(id);
    }


	}




