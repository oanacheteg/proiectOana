package com.oana.proiect.repository;

import com.oana.proiect.model.Author;

import main.java.com.oana.proiect.repository.JpaRepository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    List<Author> findByName(Long id);

    List<Author> findAll();

    Author save(Author author);

    void deleteById(Long id);
}
