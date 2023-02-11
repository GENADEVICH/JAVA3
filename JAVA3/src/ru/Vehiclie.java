package ru;

class Vehiclie {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehiclie() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }

    Vehiclie(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;

    }
}
