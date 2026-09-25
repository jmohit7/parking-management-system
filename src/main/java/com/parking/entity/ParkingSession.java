package com.parking.entity;

import com.parking.util.Status;

import java.time.LocalDateTime;

public class ParkingSession {
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private int fee;
    private Status status;
}
