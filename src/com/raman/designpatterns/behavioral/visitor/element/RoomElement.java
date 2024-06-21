package com.raman.designpatterns.behavioral.visitor.element;

import com.raman.designpatterns.behavioral.visitor.visitor.RoomVisitor;

public interface RoomElement {
    public void accept(RoomVisitor visitor);
}
