package com.sirma.springhtmlcss.designpatterns.builder;

import com.sirma.springhtmlcss.designpatterns.factory.DeviceFactory;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Phone phone = new PhoneBuilder().setOs("windows").setBatteryCapacity(3100).setDisplaySize(6.7).setRam(8).build();
    System.out.println(phone);
    }
}
