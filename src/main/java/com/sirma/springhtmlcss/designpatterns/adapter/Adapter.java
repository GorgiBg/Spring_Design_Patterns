package com.sirma.springhtmlcss.designpatterns.adapter;

public class Adapter implements Pen{
    private Pencil pencil;

    public Adapter() {
        pencil = new Pencil();
    }

    public void write(String text) {
        pencil.writeWithPencil(text);
    }
}
