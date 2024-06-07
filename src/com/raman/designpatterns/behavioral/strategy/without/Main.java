package com.raman.designpatterns.behavioral.strategy.without;
/*
    Vehicle class has drive implementation which is reused
    by OffRoadVehicle which is good,but when we see SportVehicle
    and PassengerVehicle ,they have same drive logic and the code
    is duplicated. This is not a good way to make software because
    this is hard to maintain , if we change drive logic ,we may need to change
    at different places and this is also prone to bugs.
    Later if we introduce different vehicles , they may use
    different driving strategy ,if two class uses same strategy, we have to
    implement at both places.
 */
public class Main {
}
