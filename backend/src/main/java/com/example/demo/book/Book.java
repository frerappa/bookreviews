package com.example.demo.book;

import com.example.demo.bookReview.BookReview;

import java.util.List;


public class Book {
    private String id;
    private String name;
    private String summary;
    private List<String> authors;
    private Float averageRating;
    private List<BookReview> reviews;
    private Long numberOfReviews;
    private List<String> genres;
    private Integer numberOfPages;
    private String collection;
}
