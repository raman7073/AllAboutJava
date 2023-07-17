package com.raman.concepts.lambda;

/**
 * if there is a single abstract method in interface , then this is functional interface.We can use functional
 * interface to write lambda expressions.
 * Lambda expressions can capture local variable only if they are final, or they are never modified inside
 * lambda expressions.It can access and modify instance variable and they need not to be final.
 * We can pass lambda expression as an object.
 */
@FunctionalInterface
public interface MyLambda {
    void display();
}
