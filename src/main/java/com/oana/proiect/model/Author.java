package com.oana.proiect.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity                                      
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //id va fi cheie primara
    private int id;

    @Column(nullable = false)   //aici ma asigur ca numele autorului nu poate fi null
    private String name;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)  //un autor poate avea mai multe carti
    private List<Book> books;

    public Author() {}

    public Author(String name) {
        this.name = name;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }
}
