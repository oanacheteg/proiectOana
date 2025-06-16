package com.oana.proiect.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oana.proiect.repository.OrderRepository;


@Service
public class OrderService<Order> {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        List<Order> orders = orderRepository.findByCustomerId(id);
        return orders.isEmpty() ? null : orders.get(0);
    }

    public List<Order> getOrdersByCustomerId(Long customerId) {
        return orderRepository.findByCustomerId(customerId);
    }

    public Order saveOrder(Order order) {
        return (Order) orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
