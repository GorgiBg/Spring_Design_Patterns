package com.sirma.springhtmlcss.designpatterns.composite;

import com.sirma.springhtmlcss.designpatterns.builder.Phone;
import com.sirma.springhtmlcss.designpatterns.builder.PhoneBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Component mouse = new Leaf("Mouse", 150);
        Component keyboard = new Leaf("Keyboard", 200);
        Component soundBar = new Leaf("SoundBar", 400);
        Component ram = new Leaf("Ram", 50);
        Component cpu = new Leaf("Cpu", 800);
        Component gpu = new Leaf("Gpu", 600);
        Composite motherboard = new Composite("MotherBoard");
        Composite box = new Composite("Box");
        Composite computer = new Composite("Computer");
        motherboard.addComponent(ram);
        motherboard.addComponent(cpu);
        motherboard.addComponent(gpu);
        box.addComponent(motherboard);
        computer.addComponent(mouse);
        computer.addComponent(keyboard);
        computer.addComponent(soundBar);
        computer.addComponent(box);
        computer.showPrice();

    }
}
