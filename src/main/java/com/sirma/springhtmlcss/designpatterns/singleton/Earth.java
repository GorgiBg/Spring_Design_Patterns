package com.sirma.springhtmlcss.designpatterns.singleton;

import org.hibernate.boot.model.source.spi.EmbeddedAttributeMapping;


public class Earth {

    private static Earth instance;

    private Earth() {

    }
    // lazy
    public static Earth getInstance() {
        if (instance == null) {
            return new Earth();
        } else {
            return instance;
        }
    }

    //eager

    static {
        try{
            instance = new Earth();
        }catch (Exception e) {
            throw new RuntimeException("Failed to initiate Earth singleton");
        }
    }
}
