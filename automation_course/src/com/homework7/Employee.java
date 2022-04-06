package com.homework7;

public  class Employee extends Human {
    private double salary;
    private String team;

    public Employee(String name, int age, double salary, String team) {
        super(name, age);
        this.salary = salary;
        this.team = team;
    }

    @Override
    public String sayHi() {
        return "Good morning!";
    }
}
