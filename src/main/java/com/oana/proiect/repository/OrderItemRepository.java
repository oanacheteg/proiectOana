package com.oana.proiect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository<OrderItem> extends JpaRepository<OrderItem, Long> {

    List<OrderItem> findByOrderId(Long orderId);
    List<OrderItem> findByBookId(Long bookId);
    void deleteById(Long id);
    
}