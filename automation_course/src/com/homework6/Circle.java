package com.homework6;

import java.util.concurrent.ThreadLocalRandom;

public class Circle {
    private int radius;

    public Circle() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 10);
        radius = randomNum;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double areaOfCircle() {
        return 3.14 * radius * radius;
    }

}
