package com.example.demo.book;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook(Book book){
        repository.insert(book);
    }

    public List<Book> getAllBooks(){
        return repository.findAll();
    }

    public List<Book> getBooksByName(String name){
        return repository.findByName(name);
    }

    public List<Book> getBooksByAuthor(String author){
        return repository.findBooksByAuthorsContaining(author);
    }
}
