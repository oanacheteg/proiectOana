package com.oana.proiect.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oana.proiect.repository.CustomerRepository;
import com.oana.proiect.model.Customer;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<com.oana.proiect.model.Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    public Customer getCustomerById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer saveCustomer(Customer customer) {
        return (Customer) customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

}