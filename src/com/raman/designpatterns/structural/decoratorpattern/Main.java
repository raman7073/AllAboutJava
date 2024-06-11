package com.raman.designpatterns.structural.decoratorpattern;

public class Main {
    public static void main(String[] args) {
        //just margherita
        BasePizza basePizza = new Margherita();
        System.out.println(basePizza.cost());
        //margherita with extra cheese
        BasePizza basePizza1 = new ExtraCheese(basePizza);
        System.out.println(basePizza1.cost());
        //margherita with extra cheese and veggies
        BasePizza basePizza2 = new ExtraVeggies(basePizza1);
        System.out.println(basePizza2.cost());
        //margherita with extra cheese and mushroom
        BasePizza basePizza3 = new ExtraMushroom(basePizza1);
        System.out.println(basePizza3.cost());
        BasePizza basePizza4 = new ExtraMushroom(new ExtraVeggies(new Farmhouse()));
        System.out.println(basePizza4.cost());


    }
}
