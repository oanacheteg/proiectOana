package main.java.com.oana.proiect.repository;

import java.util.List;

import com.oana.proiect.repository.Repository;

@Repository
public interface GenreRepository<Genre> extends JpaRepository<Genre, Long> {

    @SuppressWarnings("hiding")
    <Genre> List<Genre> findByName(Long id);

    <Genre> Genre save(Genre genre);
}
