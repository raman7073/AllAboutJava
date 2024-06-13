package com.raman.designpatterns.structural.bridgepattern.solution.implementor;

public class LandBreatheImplementor implements BreatheImplementor {
    @Override
    public void breathe() {
        // breathe through nose
        //inhale oxygen from air
        // exhale co2
        System.out.println("Land breathe");
    }
}
