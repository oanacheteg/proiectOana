package com.oana.proiect.controller;

import org.springframework.web.bind.annotation.*;
import com.oana.proiect.model.Author;
import com.oana.proiect.service.AuthorService;
import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {   
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();   // returneaza toti autorii din baza de date 
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id.intValue());    //cauta un autor dupa id
    }

    @GetMapping("/search")
    public List<Author> getAuthorByName(@RequestParam String name) {
        return authorService.getAuthorByName(name);   // cauta un autor dupa  nume
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);       // creeaza un autor nou si il salveaza in baza de date 
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);          // sterge autorul dupa id 
    }
}
