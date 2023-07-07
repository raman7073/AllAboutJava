package com.raman.oops.innerclasses;

public class LocalInnerClass {
    public void display(){
        class Inner{
            void innerDisplay(){
                System.out.println("Hello Local Inner Class");
            }
        }
        Inner i = new Inner();
        i.innerDisplay();
    }
}
