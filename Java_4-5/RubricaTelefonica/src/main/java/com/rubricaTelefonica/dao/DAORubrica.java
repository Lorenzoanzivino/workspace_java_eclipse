package com.rubricaTelefonica.dao;

import java.util.List;

import com.rubricaTelefonica.entity.Rubrica;

public interface DAORubrica {
	
	public void insert(Rubrica r);
	
	public Rubrica selectById(String id);
	
	public List<Rubrica> selectAll();
	
	 public Rubrica delete(String id);
}
