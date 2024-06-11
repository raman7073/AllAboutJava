package com.raman.designpatterns.interview.designparking;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize parking spots
        List<ParkingSpot> spots = new ArrayList<>();
        for (int i = 1; i <= 100; ++i) {
            if (i <= 50)
                spots.add(new ParkingSpot(i, 10));
            else
                spots.add(new ParkingSpot(i, 20));
        }

        // Create ParkingSpotManagerFactory
        ParkingSpotManagerFactory factory = new ParkingSpotManagerFactory();

        // Create EntranceGate and ExitGate objects
        EntranceGate entranceGate = new EntranceGate(factory);
        ExitGate exitGate = new ExitGate(factory);

        // Example usage
        Vehicle vehicle = new Vehicle(123, VehicleType.TwoWheeler);
        ParkingSpot spot = entranceGate.findParkingSpace(vehicle.vehicleType, spots);
        Ticket ticket = entranceGate.generateTicket(vehicle, spot);

        // Vehicle leaves
        exitGate.removeVehicle(ticket);
    }
}
