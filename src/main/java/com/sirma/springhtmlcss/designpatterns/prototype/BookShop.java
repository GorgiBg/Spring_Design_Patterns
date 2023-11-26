package com.sirma.springhtmlcss.designpatterns.prototype;

import org.hibernate.loader.ast.internal.CollectionLoaderNamedQuery;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookShop implements Cloneable{
    private String name;

    List<Book> books = Database.getBooks();

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop" +
            "books=" + books;
    }

    @Override
    protected BookShop clone () {
        ArrayList<Book> newBooks = new ArrayList<>();
        for (Book book : this.getBooks()) {
            newBooks.add(book);
        }

        BookShop bs = new BookShop();
        bs.setBooks(newBooks);
        return bs;
    }
}
