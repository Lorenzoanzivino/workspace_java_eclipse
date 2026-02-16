package com.Ecommerce_Spring.order.service;

import com.Ecommerce_Spring.order.dto.OrderCreateRequestDTO;
import com.Ecommerce_Spring.order.dto.OrderResponseDTO;
import com.Ecommerce_Spring.order.dto.OrderStatusUpdateDTO;

import java.util.List;

public interface OrderService {

    OrderResponseDTO createOrder(OrderCreateRequestDTO dto);

    OrderResponseDTO findById(String id);

    List<OrderResponseDTO> findByStatus(String status);

    OrderResponseDTO updateStatus(String id, OrderStatusUpdateDTO dto);

    void deleteOrder(String id);
}
