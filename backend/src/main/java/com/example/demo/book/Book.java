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
