package com.sirma.springhtmlcss.designpatterns.adapter;

public class Main {
    public static void main(String[] args) {
        String text = "Homework";
        Pen p = new Adapter();
        Assignment assignment = new Assignment();
        assignment.setPen(p);
        assignment.writeAssignment(text);
    }
}
