package com.Ecommerce_Spring.exceptions;

public class OrderNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public OrderNotFoundException(String id) {
        super("Ordine non trovato con id: " + id);
    }
}