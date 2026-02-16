package com.Ecommerce_Spring.product.entity;

public class Product {
    private String id, nome;
    private double price;
    private int stock;

    public Product(String id, String nome, double price, int stock) {
        this.id = id;
        this.nome = nome;
        this.price = price;
        this.stock = stock;
    }

    // Getter e Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
