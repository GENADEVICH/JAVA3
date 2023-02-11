package ru;
class Veh3cle {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;


    Veh3cle(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
    double distance (double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
    int getMaxSpeed() {
        return this.maxspeed;
    }
    int getWheels() {
        return this.wheels;
    }
    void setWheels(int wheels) {
        if ((wheels < 1) || (wheels > 24)) {
            System.out.println(("Неверное указано число колес"));
        }
        this.wheels = wheels;
    }

}
public class VehicleGetSetMethod {
    public static void main(String[] args) {
        Veh3cle ferrari = new Veh3cle(2, -2, 360, 12);
        System.out.println("Max скорость : " + ferrari.getMaxSpeed() + " км/ч");
        System.out.println("Число колес: " + ferrari.getWheels());
        ferrari.setWheels(4);
        System.out.println("Число колес (Повторно) " + ferrari.getWheels());
        }
    }




