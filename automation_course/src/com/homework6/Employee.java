package com.homework6;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() < 3){
            System.out.println("The last name is incorrect");
        }else{
            System.out.println("The last name is correct");
            this.lastName = lastName;
        }

    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 2) {
            System.out.println("The first name is incorrect!!!");
        } else {
            System.out.println("The first name is correct");
            this.firstName = firstName;

        }

    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Not a valid salary!!!");
        } else {
            System.out.println("The salary is good");
            this.salary = salary;
        }

    }
}
