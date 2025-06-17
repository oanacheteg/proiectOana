package com.oana.proiect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.oana.proiect.model.Book;
import com.oana.proiect.service.BookService;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();  // returneaza cartile 
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) { // cauta o carte dupa id
        return (Book) bookService.getBookById(id).orElse(null);   // returneaza cartea sau null daca nu exista
    }

    @GetMapping("/search")
    public List<Book> findBooksByTitle(@RequestParam String title) {
        return bookService.getBooksByTitle(title);     // le gaseste dupa titlu 
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return (Book) bookService.saveBook(book);     //  creeaza carte noua si o salveaza in baza de date 
    }

    @DeleteMapping("/{id}")                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);             // sterge cartea dupa id
    }
}
