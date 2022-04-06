package com.homework8;

public class Car implements Vehicle{

   private String brand;
    private String color;

    public Car(String brand, String color) {
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
        return "Car is moving forward";
    }

    @Override
    public String moveBackward() {
        return "Car is moving backward";
    }
}
