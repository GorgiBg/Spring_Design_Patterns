package com.sirma.springhtmlcss.designpatterns.builder;

public class PhoneBuilder {
    private String os;
    private String processor;
    private String gpu;
    private int ram;
    private double displaySize;
    private int batteryCapacity;

    private Phone phone;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;

    }

    public PhoneBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
        return this;
    }

    public PhoneBuilder setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public Phone build() {
        return new Phone(os, processor, gpu, ram, displaySize, batteryCapacity);
    }
}
