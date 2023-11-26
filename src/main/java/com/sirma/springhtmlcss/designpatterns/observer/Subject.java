package com.sirma.springhtmlcss.designpatterns.observer;

public interface Subject {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notify(String title);
}
