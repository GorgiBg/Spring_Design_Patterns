package com.sirma.springhtmlcss.designpatterns.builder.builder2;

public class House {

    private int floors;
    private int doors;
    private int windows;
    private String roofShape;
    private boolean hasPool;
    private boolean hasGarage;
    private  boolean hasFrontYard;
    private  boolean hasBackYard;

    //immutable house
    private House() {

    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setRoofShape(String roofShape) {
        this.roofShape = roofShape;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public void setHasFrontYard(boolean hasFrontYard) {
        this.hasFrontYard = hasFrontYard;
    }

    public void setHasBackYard(boolean hasBackYard) {
        this.hasBackYard = hasBackYard;
    }

    @Override
    public String toString() {
        return "House{" +
            "floors=" + floors +
            ", doors=" + doors +
            ", windows=" + windows +
            ", roofShape='" + roofShape + '\'' +
            ", hasPool=" + hasPool +
            ", hasGarage=" + hasGarage +
            ", hasFrontYard=" + hasFrontYard +
            ", hasBackYard=" + hasBackYard +
            '}';
    }

    public static class HouseBuilder {
        private House house;

        public HouseBuilder() {
            house = new House();
        }

        public HouseBuilder withFloors(int floors) {
            house.floors = floors;
            return this;
        }

        public HouseBuilder withDoors(int doors) {
            house.doors = doors;
            return this;
        }

        public HouseBuilder withWindows(int windows) {
            house.windows = windows;
            return this;
        }

        public HouseBuilder withRoofShape(String roofShape) {
            house.roofShape = roofShape;
            return this;
        }

        public HouseBuilder withPool() {
            house.hasPool = true;
            return this;
        }

        public HouseBuilder withGarage() {
            house.hasGarage =true;
            return this;
        }

        public HouseBuilder withFrontYard() {
            house.hasFrontYard =true;
            return this;
        }

        public HouseBuilder withBackYard() {
            house.hasBackYard =true;
            return this;
        }

        public House build() {
            return this.house;
        }
    }
}
