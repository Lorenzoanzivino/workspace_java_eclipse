package com.Dev_Inventory.repository;

import com.Dev_Inventory.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, String> {
    // Qui puoi aggiungere metodi di ricerca personalizzati in futuro
}