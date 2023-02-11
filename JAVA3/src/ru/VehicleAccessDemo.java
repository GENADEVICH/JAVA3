package ru;
class Veh2cle {
    int maxspeed;
    int passengers;
    int wheels;
    int burnup;

    Veh2cle(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
        }
    }


public class VehicleAccessDemo {
    public static void main(String[] args) {
        Veh2cle ferrari = new Veh2cle(2, 4, 360, 12);

        double distance = ferrari.distance(0.5);
        System.out.println("Ferrari за пол часа проедет " + distance + " км ");
        System.out.println("скорость Ferrari " + ferrari.maxspeed+ " км/ч ");

    }
}
