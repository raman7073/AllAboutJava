package com.raman.designpatterns.structural.bridgepattern.problem;

public abstract class LivingThings {
    abstract public void breatheProcess();
}


// problem is ,let say a new breathe process is introduced then
// we have to force a new class to extend this class to implement
// new breatheProcess. Both are coupled to each other. So Bridge
// pattern solves this problem by decoupling this abstraction
// from its implementation so that the two can vary independently.