package com.Ecommerce_Spring.product.dao;

import java.util.List;

import com.Ecommerce_Spring.product.entity.Product;

public interface ProductDAO {

		    public void insert(Product p);

		    public Product selectById(String id);
		   
		    public List<Product> selectAll();

		    public Product delete(String id);
	}