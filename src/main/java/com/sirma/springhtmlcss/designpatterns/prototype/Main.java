package com.sirma.springhtmlcss.designpatterns.prototype;

public class Main {
    public static void main(String[] args) {
        BookShop bookShop1 = new BookShop();
        bookShop1.setName("first");
        BookShop bookShop2 = bookShop1.clone();
        bookShop2.setName("second");
        bookShop1.getBooks().remove(0);
        for (Book book : bookShop1.getBooks()) {
            System.out.println(book.toString());
        }

        for (Book book : bookShop2.getBooks()) {
            System.out.println(book.toString());
        }
    }
}
