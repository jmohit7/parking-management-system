package com.parking.entity;

import com.parking.util.VehicleType;

public abstract class Vehicle {
    private final String vehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
    abstract VehicleType getVehicleType();
}
