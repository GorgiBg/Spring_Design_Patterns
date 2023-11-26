package com.sirma.springhtmlcss.designpatterns.factory.factory2;

import com.sirma.springhtmlcss.designpatterns.factory.factory2.Package;
import com.sirma.springhtmlcss.designpatterns.factory.factory2.Transport;

public class TransportFactory {

    private static final int TRUCK_MAX_AREA = 100;
    private static final int TRUCK_MAX_WEIGHT = 1000;
    public Transport getTransport(Package p) {
        return p.calcArea()> TRUCK_MAX_AREA ? new Ship() : p.weight> TRUCK_MAX_WEIGHT ? new Ship() : new Truck();
    }
}
