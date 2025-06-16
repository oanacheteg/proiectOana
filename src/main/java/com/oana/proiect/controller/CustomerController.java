package com.oana.proiect.controller;

import org.springframework.web.bind.annotation.*;
import com.oana.proiect.model.Customer;
import com.oana.proiect.service.CustomerService;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();   // returneaza toti clientii
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);   // returneaza un client dupa id 
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);   //creeaza un client nou si dupaia il salveaza
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);     // sterge un client dupa id
    }
}
