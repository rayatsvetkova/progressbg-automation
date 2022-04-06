package com.homework8;

public class Bike implements Vehicle {
   private String brand;
    private String color;

    public Bike(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String moveForward() {
        return "Bike is moving Forward";
    }

    @Override
    public String moveBackward() {
        return "Bike is moving backward";
    }
}
