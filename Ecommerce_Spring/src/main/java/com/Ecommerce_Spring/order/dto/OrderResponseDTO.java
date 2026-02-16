package com.Ecommerce_Spring.order.dto;

import com.Ecommerce_Spring.order.entity.OrderItem;
import com.Ecommerce_Spring.order.entity.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

public class OrderResponseDTO {

    private String id;
    private List<OrderItem> items;  // usa direttamente OrderItem
    private double totalAmount;
    private OrderStatus status;
    private LocalDateTime createdAt;

    public OrderResponseDTO(String id, List<OrderItem> items, double totalAmount, OrderStatus status, LocalDateTime createdAt) {
        this.id = id;
        this.items = items;
        this.totalAmount = totalAmount;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
