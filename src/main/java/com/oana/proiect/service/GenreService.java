package main.java.com.oana.proiect.service;

import java.util.List;

import main.java.com.oana.proiect.repository.GenreRepository;

@Service
public class GenreService<Genre> {

    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<Genre> getAllGenres() {
        return ((Object) genreRepository).findAll();
    }

    public Genre getGenreById(Long id) {
        return genreRepository.findByName(id).orElse(null);
    }

    public Object saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    public void deleteGenre(Long id) {
        ((Object) genreRepository).deleteById(id);
    }
}
