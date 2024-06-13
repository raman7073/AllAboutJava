package com.raman.designpatterns.structural.bridgepattern.solution.abstractor;

import com.raman.designpatterns.structural.bridgepattern.solution.implementor.BreatheImplementor;

public class Dog extends LivingThings {

    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
