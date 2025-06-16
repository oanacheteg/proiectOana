package com.oana.proiect.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository<Book> extends JpaRepository<Book, Long> {

    List<Book> findByTitle(String title);

    Optional<Book> findById(Long id);

    List<Book> findAll();


	void deleteById(Long id);
}
