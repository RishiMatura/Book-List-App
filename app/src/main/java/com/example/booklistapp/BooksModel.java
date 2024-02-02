package com.example.booklistapp;

public class BooksModel {
    public int img;
    public String book_name, author_name;

    public BooksModel(int img, String book_name, String author_name) {
        this.img = img;
        this.book_name = book_name;
        this.author_name = author_name;
    }
}
