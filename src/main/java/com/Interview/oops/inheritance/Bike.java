package com.Interview.oops.inheritance;

public class Bike extends Vehicle{
    private boolean hasCarrier;

    // Constructor
    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);  // Calling the superclass constructor
        this.hasCarrier = hasCarrier;
    }

    // Method to display bike details (overriding)
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call the parent class's displayInfo method
        System.out.println("Has carrier: " + (hasCarrier ? "Yes" : "No"));
    }

    // Additional method specific to Bike
    public void ringBell() {
        System.out.println(brand + " bike bell rings!");
    }
}
