package com.parking.service;

import com.parking.entity.ParkingSession;
import com.parking.entity.ParkingSpot;
import com.parking.entity.Ticket;
import com.parking.entity.Vehicle;

public class ParkingService {
    private ParkingSession parkingSession;
    private ParkingSpot parkingSpot;
    private Ticket ticket;
    private Vehicle vehicle;

    public ParkingSession getParkingSession() {
        return parkingSession;
    }

    public void setParkingSession(ParkingSession parkingSession) {
        this.parkingSession = parkingSession;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
