package com.raman.designpatterns.interview.handlenullobject;

public class VehicleFactory {
    public static Vehicle getVehicleObject(String input) {
        switch (input) {
            case "CAR":
                return new Car();
            default:
                return new NullVehicle();
        }
    }
}
