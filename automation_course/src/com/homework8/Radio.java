package com.homework8;

public class Radio implements ElectricDevices {
    String color;
    String brand;
    Boolean state;

    public Radio(String color, String brand, Boolean state) {
        this.color = color;
        this.brand = brand;
        this.state=state;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void turnOn() {
        if(state == false){
            state = true;
        }

    }

    @Override
    public void turnOff() {
        if(state == true){
            state = false;
        }

    }

    @Override
    public boolean isTurnedOn() {
        return state;
    }
}
