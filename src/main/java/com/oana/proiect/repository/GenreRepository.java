package com.oana.proiect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.oana.proiect.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {

    <Genre> List<Genre> findByName(Long id);

    <Genre> Genre saveGenre(Genre genre);
}
