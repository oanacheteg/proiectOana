package main.java.com.oana.proiect.service;

import com.oana.proiect.model.Author;
import com.oana.proiect.repository.AuthorRepository;
import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id) {
        return authorRepository.findByName(id).orElse(null);
    }

    public List<Author> getAuthorByName(String name) {
        return authorRepository.findByName(name);
    }

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
