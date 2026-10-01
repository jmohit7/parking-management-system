package com.parking.entity;

import com.parking.util.VehicleType;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super("DL");
    }

    @Override
    VehicleType getVehicleType() {
        return VehicleType.CAR;
    }
}
