package com.company.Lecture9;

public class Person {
    private int age;
    private double height;
    private String name;

    static int count=0;

    public Person(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
        count++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
