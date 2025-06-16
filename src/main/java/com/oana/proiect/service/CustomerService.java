package com.oana.proiect.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService<CustomerRepository> {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public <Customer> List<Customer> getAllCustomers() {
        return ((Object) customerRepository).findAll();
    }

    public <Customer> Customer getCustomerById(Long id) {
        return ((Object) customerRepository).findById(id).orElse(null);
    }

    public CustomerService saveCustomer(CustomerService customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
