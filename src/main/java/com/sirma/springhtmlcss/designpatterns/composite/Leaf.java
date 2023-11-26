package com.sirma.springhtmlcss.designpatterns.composite;

public class Leaf implements Component{

    private String name;
    private int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println("Component " + name + " price is : " + price);
    }
}
