package com.Ecommerce_Spring.order.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Ecommerce_Spring.order.dto.*;
import com.Ecommerce_Spring.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Crea ordine - 201 Created
    @PostMapping
    public ResponseEntity<OrderResponseDTO> create(@RequestBody OrderCreateRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.createOrder(dto));
    }

    // Cerca ordine per ID - 200 OK / 404 handled by GlobalHandler
    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDTO> getById(@PathVariable String id) {
        return ResponseEntity.ok(orderService.findById(id));
    }

    // Cerca ordini per stato - Es: /orders?status=CREATED
    @GetMapping
    public ResponseEntity<List<OrderResponseDTO>> getByStatus(@RequestParam String status) {
        return ResponseEntity.ok(orderService.findByStatus(status));
    }

    // Transizioni di stato (Aggiornamento parziale)
    @PatchMapping("/{id}/status")
    public ResponseEntity<OrderResponseDTO> updateStatus(
            @PathVariable String id, 
            @RequestBody OrderStatusUpdateDTO dto) {
        return ResponseEntity.ok(orderService.updateStatus(id, dto));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        orderService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }
}