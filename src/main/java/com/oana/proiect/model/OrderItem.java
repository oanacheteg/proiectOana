package com.oana.proiect.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne //o comanda  poate contine mai multe produse
    @JoinColumn(name = "order_id")    //fiecare produs apartine unei singure comenzi
    private Order order;

    @ManyToOne       //o carte poate sa fie cumparata de mai multe ori
    @JoinColumn(name = "book_id")  //fiecare carte are id ul ei 
    private Book book;

    @Column(nullable = false)    //comanda nu poate sa aiba cantitatea zero
    private int quantity;

    public OrderItem() {}

    public OrderItem(Order order, Book book, int quantity) {
        this.order = order;
        this.book = book;
        this.quantity = quantity;
    }  //se creeaza un orderitem si se asociaza unei comenzi, unei carti si la o cantitate 

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }

    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}