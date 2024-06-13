package com.raman.designpatterns.structural.bridgepattern.solution.abstractor;

import com.raman.designpatterns.structural.bridgepattern.solution.implementor.BreatheImplementor;

public class Fish extends LivingThings {


    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
