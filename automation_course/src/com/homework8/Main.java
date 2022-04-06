package com.homework8;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Bike("sprint", "red");
        Vehicle vehicle1 = new Car("audi", "black");
        System.out.println(vehicle.moveBackward());
        System.out.println(vehicle1.moveForward());

        ElectricDevices device = new Radio("black","vef", true);
        ElectricDevices device1 = new TV("4k","samsung",false);
        System.out.println(device.isTurnedOn());
        System.out.println(device1.isTurnedOn());


    }
}
