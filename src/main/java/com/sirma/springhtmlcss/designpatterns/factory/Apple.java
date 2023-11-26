package com.sirma.springhtmlcss.designpatterns.factory;

public class Apple implements OS{
    @Override
    public void specification() {
        System.out.println("Secure OS");
    }
}
