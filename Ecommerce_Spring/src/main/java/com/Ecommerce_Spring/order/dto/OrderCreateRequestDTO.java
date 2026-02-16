package com.Ecommerce_Spring.order.dto;

import java.util.List;

public class OrderCreateRequestDTO {
    private List<ItemRequest> items;

    public OrderCreateRequestDTO() {}

    public OrderCreateRequestDTO(List<ItemRequest> items) {
        this.items = items;
    }

    public List<ItemRequest> getItems() {
        return items;
    }

    public void setItems(List<ItemRequest> items) {
        this.items = items;
    }
}
