package com.Ecommerce_Spring.product.service;

import java.util.List;

import com.Ecommerce_Spring.product.dto.ProductDTO;
import com.Ecommerce_Spring.product.entity.Product;

public interface ProductService {
	public void registra(Product p);
	

    public Product selectById(String id);
   
    public List<Product> selectAll();

    public Product delete(String id);
    
    public ProductDTO EntitytoDTO(Product p);

    public Product DTOtoEntity(ProductDTO dto);

}
