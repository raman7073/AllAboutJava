package com.raman.designpatterns.structural.composite.arithmaticexpression;

//Number is a leaf in arithmetic expression
public class Number implements ArithmeticExpression {
    int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        System.out.println("Number value is :" + value);
        return value;
    }
}
