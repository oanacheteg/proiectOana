package com.oana.proiect.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oana.proiect.model.CustomerOrder;
import com.oana.proiect.repository.CustomerOrderRepository;



@Service
public class OrderService<T> {

    private final CustomerOrderRepository orderRepository;

    public OrderService(CustomerOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<T> getAllOrders() {
        return (List<T>) orderRepository.findAll();
    }

    public T getOrderById(Long id) {
        List<T> orders = (List<T>) orderRepository.findByCustomerId(id);
        return orders.isEmpty() ? null : orders.get(0);
    }

    public List<T> getOrdersByCustomerId(Long customerId) {
        return (List<T>) orderRepository.findByCustomerId(customerId);
    }

    public CustomerOrder saveOrder(CustomerOrder order) {
        return (CustomerOrder) orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
