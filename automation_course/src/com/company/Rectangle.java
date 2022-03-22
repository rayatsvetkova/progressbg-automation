package com.company;

public class Rectangle {
    int a;
    int b;


    public Rectangle(int inputA, int inputB) {

        this.a = inputA;
        this.b = inputB;
    }

    public int perimeterOfRectangle() {
        return 2 * a + 2 * b;
    }

    public int areaOfRectangle() {
        return a * b;
    }
}
