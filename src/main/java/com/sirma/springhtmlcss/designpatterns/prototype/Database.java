package com.sirma.springhtmlcss.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            books.add(new Book(i, "Book " + i));
        }
        return books;
    }
}
