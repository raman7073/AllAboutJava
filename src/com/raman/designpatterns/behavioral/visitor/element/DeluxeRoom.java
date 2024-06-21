package com.raman.designpatterns.behavioral.visitor.element;

import com.raman.designpatterns.behavioral.visitor.visitor.RoomVisitor;

public class DeluxeRoom implements RoomElement {
    public int roomPrice = 0;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
