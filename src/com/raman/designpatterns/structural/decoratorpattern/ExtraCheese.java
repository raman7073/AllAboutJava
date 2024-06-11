package com.raman.designpatterns.structural.decoratorpattern;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        //adding cheese cost
        return this.basePizza.cost() + 50;
    }
}
