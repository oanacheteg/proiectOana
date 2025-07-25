package com.oana.proiect.repository;

import com.oana.proiect.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

    List<Author> findByName(String name);

    List<Author> findAll();


    void deleteById(Long id);
}
