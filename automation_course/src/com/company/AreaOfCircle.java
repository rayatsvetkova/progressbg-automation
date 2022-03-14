package com.company;

public class AreaOfCircle {
    public static void main(String[] args) {
        double area = areaOfCircle(7);
        System.out.println("The area is: " + area);

    }

    public static double areaOfCircle(double r) {
        double area = 3.14 * r * r;
        return area;

    }
}