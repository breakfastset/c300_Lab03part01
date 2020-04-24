package com.example.lab03part01;

import androidx.annotation.NonNull;

class DieselCar extends Vehicle implements Vehicle.Controllable{

    private String type;

    public DieselCar(String make, int year, int price, double engine) {
        super(make, year, price, engine);
        this.type = "Diesel";
    }

    @Override
    public void control() {
        setMessage(super.getMessage() + " Emission is under control.");
    }

    @NonNull
    @Override
    public String getMessage() {
        control();
        return super.getMessage();
    }
}