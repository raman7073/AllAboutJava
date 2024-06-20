package com.raman.designpatterns.behavioral.mediator;

public interface Colleague {
    void placeBid(int bidAmount);

    void receiveBidNotification(int bidAmount);

    String getName();
}
