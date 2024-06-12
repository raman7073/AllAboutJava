package com.raman.designpatterns.structural.adapterpattern.client;

import com.raman.designpatterns.structural.adapterpattern.adaptee.WeightMachineForBabies;
import com.raman.designpatterns.structural.adapterpattern.adapter.WeightMachineAdapterImpl;
import com.raman.designpatterns.structural.adapterpattern.adapter.WeightMachineAdaptor;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdaptor weightMachineAdaptor = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdaptor.getWeightInKg());
    }
}
