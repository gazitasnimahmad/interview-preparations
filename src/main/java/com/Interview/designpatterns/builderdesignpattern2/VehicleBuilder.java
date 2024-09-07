package com.Interview.designpatterns.builderdesignpattern2;

public class VehicleBuilder implements IVehicle{
    boolean wheels;
    boolean doors;
    boolean trunk;
    boolean carrier;

    @Override
    public VehicleBuilder setWheels(boolean flag) {
        this.wheels = flag;
        return this;
    }

    @Override
    public VehicleBuilder setDoor(boolean flag) {
        this.doors = flag;
        return this;
    }

    @Override
    public VehicleBuilder setTrunk(boolean flag) {
        this.trunk = flag;
        return this;
    }

    @Override
    public VehicleBuilder setCarrier(boolean flag) {
        this.carrier = flag;
        return this;
    }

    public Vehicle build(){
        return new Vehicle(this);
    }
}
