package com.raman.designpatterns.behavioral.strategy.with;

public class SportDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sport drive capability");
    }
}
