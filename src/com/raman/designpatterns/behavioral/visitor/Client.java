package com.raman.designpatterns.behavioral.visitor;

import com.raman.designpatterns.behavioral.visitor.element.DeluxeRoom;
import com.raman.designpatterns.behavioral.visitor.element.DoubleRoom;
import com.raman.designpatterns.behavioral.visitor.element.RoomElement;
import com.raman.designpatterns.behavioral.visitor.element.SingleRoom;
import com.raman.designpatterns.behavioral.visitor.visitor.RoomMaintenanceVisitor;
import com.raman.designpatterns.behavioral.visitor.visitor.RoomPricingVisitor;
import com.raman.designpatterns.behavioral.visitor.visitor.RoomVisitor;

public class Client {
    public static void main(String[] args) {
        RoomElement single = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomElement deluxe = new DeluxeRoom();

        // performing operation on the objects

        RoomVisitor pricing = new RoomPricingVisitor();
        single.accept(pricing);
        System.out.println(((SingleRoom) single).roomPrice);
        doubleRoom.accept(pricing);
        System.out.println(((DoubleRoom) doubleRoom).roomPrice);
        //performing another operation on the objects

        RoomVisitor maintenance = new RoomMaintenanceVisitor();
        single.accept(maintenance);

    }
}
