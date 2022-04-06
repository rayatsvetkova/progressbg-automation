package com.homework7;

public abstract class Ceo extends Human {
    public Ceo(String name, int age) {
        super(name, age);
    }

    @Override
    public void setAge(int age) {
        if (age >= 50) {
            super.setAge(age);
        }else{
            throw new IllegalArgumentException("The age does not fill the criteria!!!");
        }
    }
}
