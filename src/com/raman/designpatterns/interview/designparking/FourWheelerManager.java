package com.raman.designpatterns.interview.designparking;

import java.util.List;

public class FourWheelerManager extends ParkingSpotManager {
    FourWheelerManager(List<ParkingSpot> spots) {
        super(spots);
    }

    @Override
    ParkingSpot findParkingSpace() {
        // Implementation to find nearest parking spot for Four Wheelers
        return null;
    }
}
