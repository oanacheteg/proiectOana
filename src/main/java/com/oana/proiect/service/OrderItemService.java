package com.oana.proiect.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oana.proiect.model.OrderItem;
import com.oana.proiect.repository.OrderItemRepository;


@Service
public class OrderItemService {

    private final OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public List<OrderItemService> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    public OrderItem getOrderItemById(Long id) {
        return (OrderItem) orderItemRepository.findById(id).orElse(null);
    }

    public List<OrderItemService> getOrderItemsByOrderId(Long orderId) {
        return orderItemRepository.findByOrderId(orderId);
    }

    public List<OrderItemService> getOrderItemsByBookId(Long bookId) {
        return orderItemRepository.findByBookId(bookId);
    }
    public OrderItem saveOrderItem(OrderItem orderItem) {
        return (OrderItem) orderItemRepository.save(orderItem);

    }

    public void deleteOrderItem(Long id) {
        orderItemRepository.deleteById(id);
    }
}

