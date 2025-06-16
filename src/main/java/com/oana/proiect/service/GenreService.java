package com.oana.proiect.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.oana.proiect.repository.GenreRepository;

@Service
public class GenreService<Genre> {

    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    public Genre getGenreById(Long id) {
        List<Genre> genres = genreRepository.findByName(id);
        return genres.isEmpty() ? null : genres.get(0);
    }

    public Object saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    public void deleteGenre(Long id) {
        genreRepository.deleteById(id);
    }
}
