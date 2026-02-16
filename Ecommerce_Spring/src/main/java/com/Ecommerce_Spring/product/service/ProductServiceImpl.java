package com.Ecommerce_Spring.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce_Spring.product.dao.ProductDAO;
import com.Ecommerce_Spring.product.dto.ProductDTO;
import com.Ecommerce_Spring.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDAO dao;

	
	public void registra(Product p) {
		dao.insert(p);
    }
	

    public Product selectById(String id) {
        return dao.selectById(id);
    }
   
    public List<Product> selectAll() {
        return dao.selectAll();
    }
   

    public Product delete(String id) {
        return dao.delete(id);
    }
    
    public ProductDTO EntitytoDTO(Product p) {
        return new ProductDTO(p.getId(), p.getNome(), p.getPrice(), p.getStock());
    }

    public Product DTOtoEntity(ProductDTO dto) {
        return new Product(dto.getId(), dto.getNome(), dto.getPrice(), dto.getStock());
    }
}
