package com.oana.proiect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oana.proiect.model.CustomerOrder;
import com.oana.proiect.model.CustomerOrder;

@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {

    List<CustomerOrder> findByCustomerId(Long customerId);

    List<CustomerOrder> findAll();

    void deleteById(Long id);


}
