package com.ecommerce.orderservice.service;

import com.ecommerce.orderservice.model.Order;
import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order createOrder(Order order);
    Order getOrderById(Long id);
    Order updateOrder(Long id, Order order);
    void deleteOrder(Long id);
}