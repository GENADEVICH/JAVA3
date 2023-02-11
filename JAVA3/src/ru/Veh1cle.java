package ru;

public class Veh1cle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    Veh1cle (int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
    double distance(Double interval) {
        double value = this.maxspeed * interval;
        return value;
    }
}
