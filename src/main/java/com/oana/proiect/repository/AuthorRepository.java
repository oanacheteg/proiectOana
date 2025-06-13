package com.oana.proiect.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oana.proiect.model.Author;
import com.oana.proiect.model.Book;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    public Author findByName(String name);

    public List<Author> geAuthorsList();

}