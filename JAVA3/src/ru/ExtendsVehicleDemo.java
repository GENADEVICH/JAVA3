package ru;
class Vehicle5 {
    int passengers;
    private int wheels;
    int maxspeed;
    int burnup;
    int distance;

    void Vehiclie5() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
        this.distance = 15;
    }
    static class Auto extends Vehicle5{
    boolean sunroof;
    }
}

public class ExtendsVehicleDemo {
    public static void main(String[] args) {
        Vehicle5.Auto bmw = new Vehicle5.Auto();
        bmw.sunroof =true;
        System.out.println("Путь, пройденный за 1.5 часа: " + bmw.distance + "км");
        System.out.println("Max.скорость: " + bmw.maxspeed + "км/ч");
        System.out.println("Наличие люка: " + bmw.sunroof);
    }
}
