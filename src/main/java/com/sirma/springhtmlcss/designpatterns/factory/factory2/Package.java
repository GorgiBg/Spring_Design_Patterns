package com.sirma.springhtmlcss.designpatterns.factory.factory2;

public class Package {
    int weight;
    int height;
    int width;
    int length;

    public Package(int weight, int height, int width, int length) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int calcArea() {
        return height * width *length;
    }
}
