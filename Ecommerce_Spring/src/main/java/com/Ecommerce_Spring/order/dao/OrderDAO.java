package com.Ecommerce_Spring.order.dao;

import com.Ecommerce_Spring.order.entity.Order;
import com.Ecommerce_Spring.order.entity.OrderStatus;

import java.util.List;
import java.util.Optional;

public interface OrderDAO {

    Order save(Order order);

    Optional<Order> findById(String id);

    List<Order> findByStatus(OrderStatus status);

    List<Order> findAll();

    void delete(String id);
}
