package com.Ecommerce_Spring.order.dto;

public class ItemRequest {
    private String productId;
    private int quantity;

    public ItemRequest() {} // per deserializzazione JSON

    public ItemRequest(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
