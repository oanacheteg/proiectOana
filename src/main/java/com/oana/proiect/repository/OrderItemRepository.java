package com.oana.proiect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oana.proiect.model.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

    List<OrderItem> findByOrderId(Long orderId);
    List<OrderItem> findByBookId(Long bookId);
    void deleteById(Long id);
    
}