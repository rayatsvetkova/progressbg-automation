package com.homework8;

public class TV implements ElectricDevices{
    String resolution;
    String brand;
    Boolean state;

    public TV(String resolution, String brand, Boolean state) {
        this.resolution = resolution;
        this.brand = brand;
        this.state=state;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
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
        return false;
    }
}
