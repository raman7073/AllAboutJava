package com.raman.designpatterns.behavioral.strategy.with;

public class Main {
    public static void main(String[] args) {
        Vehicle psv = new PassengerVehicle();
        psv.drive();
        Vehicle sv = new SportVehicle();
        sv.drive();
    }
}
