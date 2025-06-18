package com.oana.proiect.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.oana.proiect.model.Genre;
import com.oana.proiect.repository.GenreRepository;

@Service
public class GenreService {

    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<Genre> getAllGenres() {
        return (List<Genre>) genreRepository.findAll();
    }

    public Optional<Genre> getGenreById(Long id) {
        return genreRepository.findById(id); // Assuming genreRepository is a JpaRepository
    }

    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    public void deleteGenre(Long id) {
        genreRepository.deleteById(id.intValue());
    }

    public Genre updateGenre(Long id, Genre genre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateGenre'");
    }
}
