package com.sirma.springhtmlcss.designpatterns.builder.builder2;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder().withDoors(4).withFloors(3).withBackYard().withPool().build();
        System.out.println(house.toString());
    }
}
