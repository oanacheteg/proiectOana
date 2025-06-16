package com.oana.proiect.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository<Customer> extends JpaRepository<Customer, Long> {

    List<Customer> findByName(String name);

    void deleteById(Long id);
}
