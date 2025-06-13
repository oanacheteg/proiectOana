package main.java.com.oana.proiect.repository;

import java.util.List;

import com.oana.proiect.repository.Repository;

@Repository
public interface OrderRepository<Order> extends JpaRepository<Order, Long> {

    List<Order> findByCustomerId(Long customerId);

    List<main.java.com.oana.proiect.service.Order> findAll();

    void deleteById(Long id);

	<Order> Order save(Order order);
}
