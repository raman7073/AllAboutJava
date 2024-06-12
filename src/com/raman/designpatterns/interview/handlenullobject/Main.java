package com.raman.designpatterns.interview.handlenullobject;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("BIKE");
        printVehicleDetails(vehicle);
    }

    public static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Tanking Capacity: " + vehicle.getTankCapacity());
    }
}
/*
   When there is a large codebase ,checking null for objects using if at every place
   is not a good practise.We can use null object design pattern where it suits
   to solve our problem.
   Let see how:
    1. A null object replaces null return type.
    2. No need to put if check for checking null.
    3. Null Object reflects do nothing or Default behavior.
 */