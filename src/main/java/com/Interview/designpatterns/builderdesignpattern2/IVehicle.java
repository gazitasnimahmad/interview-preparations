package com.Interview.designpatterns.builderdesignpattern2;

public interface IVehicle {
    VehicleBuilder setWheels(boolean flag);
    VehicleBuilder setDoor(boolean flag);
    VehicleBuilder setTrunk(boolean flag);
    VehicleBuilder setCarrier(boolean flag);

}
