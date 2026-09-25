package com.parking.entity;

public abstract class Vehicle {
    private String vehicleNumber;

    public String getVehicleNumber() {
        return vehicleNumber;
    }
    abstract String getVehicleType();
}
