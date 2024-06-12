package com.raman.designpatterns.structural.adapterpattern.adapter;

import com.raman.designpatterns.structural.adapterpattern.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdaptor {
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachine.getWeightInPound();
        double weightInKg = weightInPound * 0.45;
        return weightInKg;
    }
}
