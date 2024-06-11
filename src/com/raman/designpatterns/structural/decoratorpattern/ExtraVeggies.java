package com.raman.designpatterns.structural.decoratorpattern;

public class ExtraVeggies extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraVeggies(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        //adding veggies cost
        return this.basePizza.cost() + 60;
    }
}
