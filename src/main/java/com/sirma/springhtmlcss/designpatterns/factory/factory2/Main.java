package com.sirma.springhtmlcss.designpatterns.factory.factory2;

public class Main {
    public static void main(String[] args) {
        Package p = new Package(500,5, 3, 5);
        TransportFactory transportFactory = new TransportFactory();
        transportFactory.getTransport(p).transportPackage();
    }
}
