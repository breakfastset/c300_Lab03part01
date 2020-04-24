package com.example.lab03part01;

import androidx.annotation.NonNull;

/**
 * Vehicle class that represents a vehicle with make, year and description
 *
 * @author Gorilla
 * @version 1.1
 * @since 31/03/2020
 */

public class Vehicle {
    public static int counter = 0;
    private String make;
    private int year;
    private String message;
    private int price;
    private double engine;

    // default constructor
    public Vehicle() {
        this.make = "Volvo";
        this.year = 2012;
        this.message = "This is the default message.";
    }

    /**
     * This constructor takes two parameters
     *
     * @make the make of your vehicle
     * @year the year in which the car is manufactured
     */

    public Vehicle(String make, int year, int price, double engine) {
        this.make = make;
        this.year = year;
        this.price = price;
        this.engine = engine;
        this.message = "Your car is a " + make + " built in " + year + ".";
        count();
    }

    public Vehicle(String make) {
        this();
        this.make = make;
        message = "You did not type in the year value";
        count();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @NonNull
    @Override
    public String toString() {
        return message;
    }

    public String getMake() {
        return make;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void count() {
        this.counter++;
    }

    interface Controllable {
        void control();
    }
}
