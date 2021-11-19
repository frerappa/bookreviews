package com.example.demo.book;

import com.example.demo.bookReview.BookReview;

import java.util.ArrayList;
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

    public Book(String name, String summary, List<String> authors, List<String> genres, Integer numberOfPages, String collection) {
        this.id = "asdasd";
        this.name = name;
        this.summary = summary;
        this.authors = authors;
        this.averageRating = 0F;
        this.reviews = new ArrayList<>();
        this.numberOfReviews = 0L;
        this.genres = genres;
        this.numberOfPages = numberOfPages;
        this.collection = collection;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public Float getAverageRating() {
        return averageRating;
    }

    public List<BookReview> getReviews() {
        return reviews;
    }

    public Long getNumberOfReviews() {
        return numberOfReviews;
    }

    public List<String> getGenres() {
        return genres;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public String getCollection() {
        return collection;
    }
}
