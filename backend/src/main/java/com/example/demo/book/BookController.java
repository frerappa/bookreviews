package com.example.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/books")
public class BookController {
    private final BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getBooks() {
        return ResponseEntity.ok(service.getAllBooks());
    }

    @PostMapping
    public ResponseEntity<HttpStatus> addBook(@RequestBody Book book){
        service.addBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping(path = "/{id}/rate")
    public ResponseEntity<HttpStatus> addRating(@PathVariable String id, int rating) {
        service.addRating(id, rating);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
