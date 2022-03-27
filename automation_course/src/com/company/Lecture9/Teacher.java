package com.company.Lecture9;

public class Teacher extends Person {
    private String teachingClass;


    public Teacher(int age, double height, String name, String teachingClass) {
        super(age, height, name);
        this.teachingClass=teachingClass;
    }

    public String getTeachingClass() {
        return teachingClass;
    }

    public void setTeachingClass(String teachingClass) {
        this.teachingClass = teachingClass;
    }
}
