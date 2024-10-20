package com.xerox_app.application.service;
import com.xerox_app.application.model.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class OrderService {
    private Map<String, Order> orders = new HashMap<>();

    public Order createOrder(Order order, MultipartFile file) throws IOException {
        order.setFileName(file.getOriginalFilename());
        order.setFileContent(file.getBytes());
        orders.put(order.getOrderId(), order);
        return order;
    }

    public Order getOrder(String orderId) {
        return orders.get(orderId);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }

    public Order updateOrderStatus(String orderId, String newStatus) {
        Order order = orders.get(orderId);
        if (order != null) {
            order.setOrderStatus(newStatus);
            if ("Confirmed".equals(newStatus)) {
                order.setOrderConfirmedDate(LocalDateTime.now());
            }
        }
        return order;
    }

    public List<Order> getOrdersByUser(String userEmail) {
        return orders.values().stream()
                .filter(order -> order.getUserEmail().equals(userEmail))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByShop(String shopId) {
        return orders.values().stream()
                .filter(order -> order.getShopId().equals(shopId))
                .collect(Collectors.toList());
    }
}