package com.raman.designpatterns.behavioral.strategy.with;
//concrete strategy
public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
