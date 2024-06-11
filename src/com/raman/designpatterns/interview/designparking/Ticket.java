package com.raman.designpatterns.interview.designparking;

import java.time.LocalDateTime;

public class Ticket {
    LocalDateTime entryTime;
    ParkingSpot parkingSpot;
    Vehicle vehicle;

    public Ticket(LocalDateTime entryTime, ParkingSpot parkingSpot, Vehicle vehicle) {
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }
}
