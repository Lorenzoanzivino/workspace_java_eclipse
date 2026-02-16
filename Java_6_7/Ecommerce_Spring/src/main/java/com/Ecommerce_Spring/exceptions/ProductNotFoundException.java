package com.Ecommerce_Spring.exceptions;

public class ProductNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public ProductNotFoundException(String id) {
        super("Prodotto non trovato con id: " + id);
    }
}