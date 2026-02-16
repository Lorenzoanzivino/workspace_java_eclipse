package com.Ecommerce_Spring.order.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private String id;
    private List<OrderItem> orderItemList;
    private double totalAmount;
    private OrderStatus status;
    private LocalDateTime createdAt;

    public Order(String id, List<OrderItem> orderItemList, double totalAmount) {
        this.id = id;
        this.orderItemList = orderItemList;
        this.totalAmount = totalAmount;
        this.status = OrderStatus.CREATED;      // stato iniziale obbligatorio
        this.createdAt = LocalDateTime.now();  // timestamp automatico
    }

    // getters

    public String getId() {
        return id;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
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

    // setter solo per lo stato (transizioni controllate dal service)

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
