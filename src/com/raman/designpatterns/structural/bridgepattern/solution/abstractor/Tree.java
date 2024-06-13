package com.raman.designpatterns.structural.bridgepattern.solution.abstractor;

import com.raman.designpatterns.structural.bridgepattern.solution.implementor.BreatheImplementor;

public class Tree extends LivingThings {

    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
