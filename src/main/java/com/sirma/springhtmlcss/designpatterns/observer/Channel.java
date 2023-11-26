package com.sirma.springhtmlcss.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private String name;
    private List<Subscriber> subscribers = new ArrayList<>();
    private String title;

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notify(String title) {
        for (Subscriber subscriber : subscribers) {
            System.out.println("Hey " + subscriber.getName() + " i just uploaded new video with title: " + title);
        }
    }

    public String getName() {
        return name;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }
}
