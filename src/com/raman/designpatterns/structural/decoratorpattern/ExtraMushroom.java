package com.raman.designpatterns.structural.decoratorpattern;

public class ExtraMushroom extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraMushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        //cost of mushroom-200
        return this.basePizza.cost() + 200;
    }
}
