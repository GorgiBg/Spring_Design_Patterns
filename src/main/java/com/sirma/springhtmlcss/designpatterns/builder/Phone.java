package com.sirma.springhtmlcss.designpatterns.builder;

public class Phone {
    private String os;
    private String processor;
    private String gpu;
    private int ram;
    private double displaySize;
    private int batteryCapacity;

    public Phone(String os, String processor, String gpu, int ram, double displaySize, int batteryCapacity) {
        this.os = os;
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
        this.displaySize = displaySize;
        this.batteryCapacity = batteryCapacity;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Phone" +
            "os='" + os + '\'' +
            ", processor='" + processor + '\'' +
            ", gpu='" + gpu + '\'' +
            ", ram=" + ram +
            ", displaySize=" + displaySize +
            ", batteryCapacity=" + batteryCapacity
           ;
    }
}
