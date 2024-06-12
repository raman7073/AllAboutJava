package com.raman.designpatterns.interview.handlenullobject;

public class Car implements Vehicle {
    @Override
    public int getTankCapacity() {
        return 40;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}
