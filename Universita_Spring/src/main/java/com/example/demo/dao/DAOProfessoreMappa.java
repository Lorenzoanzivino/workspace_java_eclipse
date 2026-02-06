package com.example.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.demo.entity.Professore;

public class DAOProfessoreMappa {
	
	private Map<String, Professore> mappa = new HashMap<>();
	
	public boolean insert(Professore p) {
        if (mappa.containsKey(p.getId())) {
            return false;
        }
        mappa.put(p.getId(), p);
        return true;
    }

    public Professore selectById(String id) {
        return mappa.get(id);
    }
   
    public List<Professore> selectAll() {
        return new ArrayList<>(mappa.values());
    }
   

    public Professore delete(String id) {
        return mappa.remove(id);
    }

}
