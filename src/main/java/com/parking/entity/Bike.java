package com.parking.entity;

import com.parking.util.VehicleType;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    VehicleType getVehicleType() {
        return VehicleType.BIKE;
    }
}
