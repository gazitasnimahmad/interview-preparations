package com.Interview.designpatterns.builderdesignpattern2;

public class MainClass {

    public static void main(String[] args){
        Vehicle car = new VehicleBuilder().setWheels(true).setDoor(true).setTrunk(true).setCarrier(false).build();
        Vehicle bike = new VehicleBuilder().setCarrier(true).setTrunk(false).setWheels(true).setDoor(false).build();

        System.out.println(car.toString());
    }
}
