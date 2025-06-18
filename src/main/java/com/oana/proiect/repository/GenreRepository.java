package com.oana.proiect.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.oana.proiect.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {

    public List<Genre> findByName(String name);

    public Optional<com.oana.proiect.model.Genre> findById(Long id);
}
