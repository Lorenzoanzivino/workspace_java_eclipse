package com.Ecommerce_Spring.product.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce_Spring.product.dto.ProductDTO;
import com.Ecommerce_Spring.product.entity.Product;
import com.Ecommerce_Spring.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<ProductDTO> getAll() {
        return service.selectAll()
                      .stream()
                      .map(service::EntitytoDTO)
                      .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getById(@PathVariable String id) {
        Product p = service.selectById(id);
        if (p == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(service.EntitytoDTO(p));
    }

    @PostMapping
    public ResponseEntity<ProductDTO> create(@RequestBody ProductDTO dto) {
        Product p = service.DTOtoEntity(dto);
        service.registra(p);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.EntitytoDTO(p));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        Product deleted = service.delete(id);
        if (deleted == null) return ResponseEntity.notFound().build();
        return ResponseEntity.noContent().build();
    }
}
