package com.impiegatiJPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.impiegatiJPA.entity.Impiegato;

@Repository
public interface ImpiegatoDAO extends JpaRepository<Impiegato, Integer>{

}
