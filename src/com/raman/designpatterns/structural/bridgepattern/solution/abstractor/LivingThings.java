package com.raman.designpatterns.structural.bridgepattern.solution.abstractor;

import com.raman.designpatterns.structural.bridgepattern.solution.implementor.BreatheImplementor;

public abstract class LivingThings {

    BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    abstract public void breatheProcess();
}
