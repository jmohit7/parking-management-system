package com.parking.entity;

public class ParkingSpot {
    private String spotNumber;
    private String currentStatus;
    private String suitableFor;
    private Vehicle vehicle;

    public String getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(String spotNumber) {
        this.spotNumber = spotNumber;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getSuitableFor() {
        return suitableFor;
    }

    public void setSuitableFor(String suitableFor) {
        this.suitableFor = suitableFor;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
