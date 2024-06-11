package com.raman.designpatterns.interview.designparking;

import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager {
    TwoWheelerManager(List<ParkingSpot> spots) {
        super(spots);
    }

    @Override
    ParkingSpot findParkingSpace() {
        return null;
    }
}
