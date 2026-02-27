package com.EcommerceJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EcommerceJPA.entity.Venditore;

@Repository
public interface VenditoreRepository extends JpaRepository<Venditore, Integer>{

}
