package com.homework7;

public class Employee extends Person {
    private double salary;
    private String team;

    public Employee(String name, int age, double salary, String team) {
        super(name, age);
        this.salary = salary;
        this.team = team;
    }
}
