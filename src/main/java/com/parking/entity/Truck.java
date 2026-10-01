package com.parking.entity;

import com.parking.util.VehicleType;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    VehicleType getVehicleType() {
        return VehicleType.TRUCK;
    }
}
