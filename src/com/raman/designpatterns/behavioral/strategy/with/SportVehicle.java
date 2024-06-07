package com.raman.designpatterns.behavioral.strategy.with;

public class SportVehicle extends Vehicle{
    SportVehicle() {
        super(new SportDriveStrategy());
    }
}
