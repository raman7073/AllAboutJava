package com.raman.oops.inheritence;

public class InheritTest {
    public static void main(String[] args) {
        // Parent parent = new Parent();
        Child child = new Child(2, 3);
        Parent parent = new Child();
        parent.test();
        /**
         * Constructor from top to bottom is called
         * Child child1 = new Parent(); give error child is not a parent type
         * this() or super() must be first statement of constructor
         * this() -> used to call constructor of same class
         * super()-> used to call constructor of immediate parent
         * public Child(){this();} will give Recursive Constructor
         * Invocation Error
         * this is reference to current object
         * super is reference to immediate parent of current object
         * About method calling, let say if we want to call test method on child object , the controller looks
         * for method in child class , if it's not there , then it looks in parent class
         * Dynamic Method Dispatch :
         * Parent p = new Child();
         * p.test(); -> method of object type is called.
         * A super class reference holding an object of subclass and  overrided method is called then method
         * of subclass will be called.This is Dynamic Method Dispatch.
         *
         * A super class reference holding an object of subclass can call only methods defined in super class.
         * final method can not be overriden.
         * Run time and compile time polymorphism
         */

    }
}
