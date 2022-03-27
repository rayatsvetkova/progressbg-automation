package com.company.Lecture9;

public class Student extends Person {
    private String classes[];
    public Student(int age, double height, String name,String classes[]) {
        super(age, height, name);
        this.classes=classes;
    }

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }
}
