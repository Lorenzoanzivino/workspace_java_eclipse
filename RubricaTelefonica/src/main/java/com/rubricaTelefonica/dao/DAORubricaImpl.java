package com.rubricaTelefonica.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.rubricaTelefonica.entity.Rubrica;

@Repository
public class DAORubricaImpl implements DAORubrica{
private Map<String, Rubrica> mappa = new HashMap<>();

    
    public void insert(Rubrica r) {
    	if(r == null) {
    		throw new RuntimeException("Rubrica nulla");
    	}else if(r.getId() == null) {
    		throw new RuntimeException("id Nullo");
    	}else if (mappa.containsKey(r.getId())) {
            throw new RuntimeException("Rubrica già presente con id: " + r.getId());
        }
        mappa.put(r.getId(), r);
    }

    public Rubrica selectById(String id) {
        if (id == null) {
        	throw new RuntimeException("id nullo");
        }return mappa.get(id);
    }
   
    public List<Rubrica> selectAll() {
        return new ArrayList<>(mappa.values());
    }
   

    public Rubrica delete(String id) {
    	if (id == null) {
        	throw new RuntimeException("id nullo");
    	}return mappa.remove(id);
    }
    

}    