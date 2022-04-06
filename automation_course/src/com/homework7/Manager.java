package com.homework7;

public  class Manager extends Human {
    private String manageTeam;

    public Manager(String name, int age, String manageTeam) {
        super(name, age);
        this.manageTeam = manageTeam;
    }

    @Override
    public String sayHi() {
        return "Hello!";
    }
}
