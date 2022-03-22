package com.company;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r > 0) {
            this.r = r;
        }
    }

    public double perimeter() {
        return 2 * 3.14 * r;
    }

    public double area() {
        return 3.14 * r * r;

    }
}
