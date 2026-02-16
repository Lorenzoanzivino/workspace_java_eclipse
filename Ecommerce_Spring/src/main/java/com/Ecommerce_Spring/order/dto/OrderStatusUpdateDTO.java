package com.Ecommerce_Spring.order.dto;

import com.Ecommerce_Spring.order.entity.OrderStatus;

public class OrderStatusUpdateDTO {
    private OrderStatus status;

    public OrderStatusUpdateDTO() {}

    public OrderStatusUpdateDTO(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
