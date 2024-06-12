package com.raman.designpatterns.structural.adapterpattern.adaptee;

public class WeightMachineForBabies implements WeightMachine {
    @Override
    public double getWeightInPound() {
        return 28;
    }
}
