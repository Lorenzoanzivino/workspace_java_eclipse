package com.Ecommerce_Spring.product.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.Ecommerce_Spring.product.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	private Map<String, Product> mappa = new HashMap<>();

	    
	    public void insert(Product p) {
	    	if(p == null) {
	    		throw new RuntimeException("Prodotto nullo");
	    	}else if(p.getId()== null) {
	    		throw new RuntimeException("id del prodotto Nullo");
	    	}else if (mappa.containsKey(p.getId())) {
	            throw new RuntimeException("prodotto già presente con id: " + p.getId());
	        }
	        mappa.put(p.getId(), p);
	    }

	    public Product selectById(String id) {
	        if (id == null) {
	        	throw new RuntimeException("id nullo");
	        }return mappa.get(id);
	    }
	   
	    public List<Product> selectAll() {
	        return new ArrayList<>(mappa.values());
	    }
	   

	    public Product delete(String id) {
	    	if (id == null) {
	        	throw new RuntimeException("id nulla");
	    	}return mappa.remove(id);
	    }
}