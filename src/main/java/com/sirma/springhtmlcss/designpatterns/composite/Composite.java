package com.sirma.springhtmlcss.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private String name;
    private List<Component> components = new ArrayList<>();
    @Override
    public void showPrice() {
        for (Component component : components) {
            component.showPrice();
        }
    }

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        components.add(component);
    }
}
