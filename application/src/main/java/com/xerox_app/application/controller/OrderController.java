package com.xerox_app.application.controller;

import com.xerox_app.application.model.Order;
import com.xerox_app.application.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestPart("order") Order order,
                                             @RequestPart("file") MultipartFile file) {
        try {
            Order createdOrder = orderService.createOrder(order, file);
            return ResponseEntity.ok(createdOrder);
        } catch (IOException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrder(@PathVariable String orderId) {
        Order order = orderService.getOrder(orderId);
        return order != null ? ResponseEntity.ok(order) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PutMapping("/{orderId}/status")
    public ResponseEntity<Order> updateOrderStatus(@PathVariable String orderId,
                                                   @RequestParam String newStatus) {
        Order updatedOrder = orderService.updateOrderStatus(orderId, newStatus);
        return updatedOrder != null ? ResponseEntity.ok(updatedOrder) : ResponseEntity.notFound().build();
    }

    @GetMapping("/user/{userEmail}")
    public List<Order> getOrdersByUser(@PathVariable String userEmail) {
        return orderService.getOrdersByUser(userEmail);
    }

    @GetMapping("/shop/{shopId}")
    public List<Order> getOrdersByShop(@PathVariable String shopId) {
        return orderService.getOrdersByShop(shopId);
    }
}