package main.java.com.oana.proiect.service;

import com.oana.proiect.repository.BookRepository;
import java.util.List;
import java.util.Optional;

@Service
public class BookService<Book> {

    @SuppressWarnings("rawtypes")
    private final BookRepository BookRepository;

    public BookService(@SuppressWarnings("rawtypes") BookRepository BookRepository) {
        this.BookRepository = BookRepository;
    }

    public List<Book> getAllBooks() {
        return BookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return BookRepository.findById(id);
    }

    @SuppressWarnings("unchecked")
    public List<Book> getBooksByTitle(String title) {
        return BookRepository.findByTitle(title);
    }

    public Book saveBook(Book Book) {
        return com.oana.proiect.repository.BookRepository.save(Book);
    }

    public void deleteBook(Long id) {
        BookRepository.deleteById(id);
    }
}
