package com.sirma.springhtmlcss.designpatterns.observer;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();
        for (int i = 1; i < 10 ; i++) {
            channel.subscribe(new Subscriber("Subscriber " + i));
        }
        channel.notify("How to learn design Patterns!");

        for (Subscriber subscriber : channel.getSubscribers()) {
            channel.unsubscribe(subscriber);
            break;
        }

        channel.notify("How to learn Java!!!");

    }
}
