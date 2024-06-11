package com.raman.designpatterns.interview.designparking;


import java.util.List;

public abstract class ParkingSpotManager {

    List<ParkingSpot> spotList;

    public ParkingSpotManager(List<ParkingSpot> spotList) {
        this.spotList = spotList;
    }

    abstract ParkingSpot findParkingSpace();

    void parkVehicle(Vehicle v) {
        ParkingSpot spot = findParkingSpace();
        spot.parKVehicle(v);
    }

    void removeVehicle(Vehicle v) {
        for (ParkingSpot spot : spotList) {
            if (spot.vehicle != null && spot.vehicle.equals(v)) {
                spot.removeVehicle();
                break;
            }
        }
    }
}
