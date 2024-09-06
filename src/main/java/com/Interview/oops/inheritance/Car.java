package com.Interview.oops.inheritance;

public class Car extends Vehicle {
    private int doors;

    // Constructor
    public Car(String brand, int speed, int doors) {
        super(brand, speed);  // Calling the superclass constructor
        this.doors = doors;
    }

    // Method to display car details (overriding)
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call the parent class's displayInfo method
        System.out.println("Doors: " + doors);
    }

    // Additional method specific to Car
    public void openTrunk() {
        System.out.println("Trunk opened for " + brand);
    }
}
