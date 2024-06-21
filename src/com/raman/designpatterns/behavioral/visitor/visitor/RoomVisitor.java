package com.raman.designpatterns.behavioral.visitor.visitor;

import com.raman.designpatterns.behavioral.visitor.element.DeluxeRoom;
import com.raman.designpatterns.behavioral.visitor.element.DoubleRoom;
import com.raman.designpatterns.behavioral.visitor.element.SingleRoom;

public interface RoomVisitor {
    public void visit(SingleRoom singleRoom);

    public void visit(DoubleRoom doubleRoom);

    public void visit(DeluxeRoom deluxeRoom);
}
