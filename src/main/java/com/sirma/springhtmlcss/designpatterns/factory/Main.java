package com.sirma.springhtmlcss.designpatterns.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String deviceOS = scanner.nextLine().trim();
        DeviceFactory factory = new DeviceFactory();
        factory.getDevice(deviceOS).specification();
    }
}
