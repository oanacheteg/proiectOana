package main.java.com.oana.proiect.repository;

import java.util.List;

import com.oana.proiect.repository.Repository;

@Repository
public interface CustomerRepository<Customer> extends JpaRepository<Customer, Long> {

    List<Customer> findByName(String name);
}
