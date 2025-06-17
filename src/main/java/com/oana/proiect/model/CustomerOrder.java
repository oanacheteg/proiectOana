package com.oana.proiect.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
    public class CustomerOrder {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
    
        @ManyToOne                                //un client poate sa aiba mai multe comenzi
        @JoinColumn(name = "customer_id")          // o comanda apartine unui singur client
        private Customer customer;
    
        @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)    //o comanda poate sa contina mai multe produse
        private List<OrderItem> orderItems;
    
        public CustomerOrder() {}
    
        public CustomerOrder(Customer customer) {     //se initializeaza comanda asociindu-se unui client
            this.customer = customer;
        }
    
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
    
        public Customer getCustomer() { return customer; }
        public void setCustomer(Customer customer) { this.customer = customer; }
    
        public List<OrderItem> getOrderItems() { return orderItems; }
        public void setOrderItems(List<OrderItem> orderItems) { this.orderItems = orderItems; }
    }
    

