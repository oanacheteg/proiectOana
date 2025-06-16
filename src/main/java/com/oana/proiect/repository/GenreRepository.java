package com.oana.proiect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository<Genre> extends JpaRepository<Genre, Long> {

    @SuppressWarnings("hiding")
    <Genre> List<Genre> findByName(Long id);

    <Genre> Genre saveGenre(Genre genre);
}
