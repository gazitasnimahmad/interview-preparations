package com.Interview.oops.inheritance;

public class Vehicle {
    protected String brand;
    protected int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display vehicle details
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    // Method to accelerate
    public void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated. Current speed: " + speed + " km/h");
    }
}
