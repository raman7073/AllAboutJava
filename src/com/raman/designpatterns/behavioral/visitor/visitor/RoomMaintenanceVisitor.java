package com.raman.designpatterns.behavioral.visitor.visitor;
// for each operation we can have visitor,so we don't need to change the
// structure.

import com.raman.designpatterns.behavioral.visitor.element.DeluxeRoom;
import com.raman.designpatterns.behavioral.visitor.element.DoubleRoom;
import com.raman.designpatterns.behavioral.visitor.element.SingleRoom;

public class RoomMaintenanceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Performing maintenance of single room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Performing maintenance of double room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Performing maintenance of deluxe room");
    }
}
