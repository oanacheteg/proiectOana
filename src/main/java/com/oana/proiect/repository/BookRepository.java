package com.oana.proiect.repository;

import java.util.List;
import java.util.Optional;

import main.java.com.oana.proiect.repository.JpaRepository;

@Repository
public interface BookRepository<Book> extends JpaRepository<Book, Long> {

    List<Book> findByTitle(String title);

    Optional<Book> findById(Long id);

    List<Book> findAll();

    static <Book> Book save(Book book) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

	void deleteById(Long id);
}
