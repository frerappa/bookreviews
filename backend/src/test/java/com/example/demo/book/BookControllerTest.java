package com.example.demo.book;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookControllerTest {
    @Autowired
    private BookController bookController;


    @Test
    void addBook() {
        Book book = new Book(
                "Book",
                "This is a book",
                List.of("Author A", "Author B"),
                List.of("Fiction"),
                1234,
                "collection");
    }
}
