package com.Interview.designpatterns.builderdesignpattern2;

public class Vehicle {
    private boolean wheels;
    private boolean door;
    private boolean trunk;
    private boolean carrier;

    public Vehicle(VehicleBuilder vehicleBuilder) {
        this.wheels=vehicleBuilder.wheels;
        this.door=vehicleBuilder.doors;
        this.trunk=vehicleBuilder.trunk;
        this.carrier=vehicleBuilder.carrier;
    }

    public boolean getWheels(){
        return this.wheels;
    }

    public boolean getDoors(){
        return this.door;
    }

    public boolean getTrunk(){
        return this.trunk;
    }

    public boolean getCarrier(){
        return this.carrier;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", door=" + door +
                ", trunk=" + trunk +
                ", carrier=" + carrier +
                '}';
    }
}
