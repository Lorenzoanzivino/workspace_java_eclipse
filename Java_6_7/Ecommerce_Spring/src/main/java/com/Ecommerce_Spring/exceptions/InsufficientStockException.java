package com.Ecommerce_Spring.exceptions;

public class InsufficientStockException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public InsufficientStockException(String productName) {
        super("Stock insufficiente per il prodotto: " + productName);
    }
}