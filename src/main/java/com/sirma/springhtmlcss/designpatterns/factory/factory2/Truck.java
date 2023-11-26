package com.sirma.springhtmlcss.designpatterns.factory.factory2;

public class Truck implements Transport{
    @Override
    public void transportPackage() {
        System.out.println("Transport with Truck");
    }
}
