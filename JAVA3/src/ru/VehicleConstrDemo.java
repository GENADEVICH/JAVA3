package ru;

class Vehicle4 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    Vehicle4(int p, int w, int ms, int bu) {
        passengers = p;
        wheels = w;
        maxspeed = ms;
        burnup = bu;
    }
    double distance(double interval) {
        double value = maxspeed * interval;
                return value;
    }
}

public class VehicleConstrDemo {
    public static void main(String[] args) {
        Vehicle4 car = new Vehicle4(2, 4, 130, 30);
        Vehicle4 bus = new Vehicle4(45, 4, 130, 30);

        double interval = 1;
        double distanceCar = car.distance(interval);
        double distanceBus = car.distance(interval);
        System.out.println("Автомобиль с " + car.passengers +" пассажирами" + " пройдет за 1 час " + distanceCar + " км");

        System.out.println("Автобус с " + bus.passengers +" пассажирами" + " пройдет за 1 час " + distanceBus + " км");
    }
}
