package com.example.lab03part01;

class PetrolCar extends Vehicle {
    private String color;
    public PetrolCar(String make, int year, String color, int price, double engine) {
        super(make, year, price, engine);
        this.color = color;
        setMessage(getMessage() + " I like your shining " + color + " color.");
    }
}