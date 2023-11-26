package com.sirma.springhtmlcss.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {

    private String name;
    private List<Channel> channelList = new ArrayList<>();

    public String getName() {
        return name;
    }

    @Override
    public void subscribeToChannel(Channel channel) {
        channelList.add(channel);
        System.out.println("You have just subscribed to " + channel.getName());
    }

    @Override
    public void unsubscribeToChannel(Channel channel) {
        this.channelList.remove(channel);
        System.out.println("You have just unsubscribed from " + channel.getName());
    }

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notify(Channel channel, String title) {
        System.out.println("Hey " + this.getName() + " channel " + channel.getName() +
            " i just uploaded new video with title: " + title);
    }
}
