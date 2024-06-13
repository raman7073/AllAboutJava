package com.raman.designpatterns.structural.bridgepattern.solution;

import com.raman.designpatterns.structural.bridgepattern.solution.abstractor.Dog;
import com.raman.designpatterns.structural.bridgepattern.solution.abstractor.LivingThings;
import com.raman.designpatterns.structural.bridgepattern.solution.implementor.LandBreatheImplementor;

public class Main {
    public static void main(String[] args) {
        LivingThings dog = new Dog(new LandBreatheImplementor());
        dog.breatheProcess();
    }
}
//Now any new breathe process come , it can grow independently.
/*
   Bridge vs Strategy Pattern
   The difference is in intent, in case of strategy , we are changing
   behavior of context class at run time.in case of bridge,
   the intent is two can vary/grow independently.

 */