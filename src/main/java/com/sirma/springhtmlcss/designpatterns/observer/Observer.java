package com.sirma.springhtmlcss.designpatterns.observer;

public interface Observer {
    void subscribeToChannel(Channel channel);

    void unsubscribeToChannel(Channel channel);

    void notify(Channel channel, String title);
}
