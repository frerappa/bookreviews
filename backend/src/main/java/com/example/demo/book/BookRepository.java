package com.example.demo.book;


import com.mongodb.client.MongoClient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String>{
    List<Book> findByName(String name);
    List<Book> findBooksByAuthorsContaining(String author);
}


