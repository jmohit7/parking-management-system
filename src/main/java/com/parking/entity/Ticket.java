package com.parking.entity;

import java.time.LocalDateTime;

public class Ticket {
    private String ticketNumber;
    private LocalDateTime issueTime;
    private ParkingSession parkingSession;

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public LocalDateTime getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(LocalDateTime issueTime) {
        this.issueTime = issueTime;
    }

    public ParkingSession getParkingSession() {
        return parkingSession;
    }

    public void setParkingSession(ParkingSession parkingSession) {
        this.parkingSession = parkingSession;
    }
}
