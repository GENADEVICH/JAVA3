package ru;

class Vehicle7 {
    int passengers;
    private int wheels;
    int maxspeed;
    int burnup;

    public Vehicle7(int f, int g, int h, int j) {

    }


    public String toString() {
        return "Vehicle(passengers)=" + passengers + ";" + "wheels" + wheels + ";" + "maxspeed=" + maxspeed + ";" + "burnup" + burnup ;
    }
}
class Auto1 extends Vehicle7 {
    boolean sunroof;
    Auto1 (boolean sunroof) {
        this (4, 4, 200, 12, sunroof);
    }
    Auto1(int f, int g, int h, int j, boolean sunroof){
        super (f, g, h, j);
        this.sunroof = sunroof;
    }
}

public class PolyVehicleDemo {
    public static void main(String[] args) {
        Auto a = new Auto(true);
                Vehicle v = new Vehicle();
        Vehicle[] pvd = { a, v};
        for (int i = 0; i < pvd.length; i++){
            System.out.println(pvd[i].toString());
        }
    }
}
