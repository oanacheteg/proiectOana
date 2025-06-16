package com.oana.proiect.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oana.proiect.model.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByTitle(String title);

    Optional<Book> findById(Long id);

    List<Book> findAll();


	void deleteById(Long id);
}
