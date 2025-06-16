package com.oana.proiect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oana.proiect.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findByCustomerId(Long customerId);

    List<Order> findAll();

    void deleteById(Long id);

    public Order saveOrder(Order order);


}
