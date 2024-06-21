package com.raman.designpatterns.behavioral.visitor.visitor;

import com.raman.designpatterns.behavioral.visitor.element.DeluxeRoom;
import com.raman.designpatterns.behavioral.visitor.element.DoubleRoom;
import com.raman.designpatterns.behavioral.visitor.element.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Pricing computation logic of single room");
        singleRoom.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Pricing computation logic of double room");
        doubleRoom.roomPrice = 2000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Pricing computation logic of deluxe room");
        deluxeRoom.roomPrice = 1000;
    }
}
