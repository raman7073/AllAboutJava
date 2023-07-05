package com.raman.oops.inheritence;

public class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
    public Child(int x){
        super(x);
        System.out.println("Child Param Constructor");
    }
    public Child(int x,int y){
        this(y);
        System.out.println("Child 2 Param Constructor");
    }

    @Override
    public void test() {
       // super.test();
        System.out.println("test from child");
    }
}
