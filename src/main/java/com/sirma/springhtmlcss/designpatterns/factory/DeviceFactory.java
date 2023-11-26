package com.sirma.springhtmlcss.designpatterns.factory;

public class DeviceFactory {
    private String osType;

    OS getDevice(String osType) {
        if (osType.equals("Android")) {
            return new Android();
        } else if (osType.equals("Apple")) {
            return new Apple();
        } else {
            return new Windows();
        }
    }
}
