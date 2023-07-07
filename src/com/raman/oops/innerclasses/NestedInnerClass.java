package com.raman.oops.innerclasses;

/**
 * Inner class can access members of outer class. To use member of inner class by outer class
 * first we need to create object of inner class.
 * for every class there is a .class file ,so in case of inner class we have Outer$Inner.class file
 * Example of Nested Inner Class
 */
public class NestedInnerClass {
    int x = 10;
   // will work before defining Inner class because all these are
   //inside same class
   InnerClass i = new InnerClass();


    public void outerDisplay() {
        System.out.println("outerDisplay");
    }

    public class InnerClass {
        int y = 20;

        void innerDisplay() {
            outerDisplay();
            System.out.println(x + y);
        }
    }
    void outerDisplay2(){
        InnerClass innerClass = new InnerClass();
        innerClass.innerDisplay();
    }

}
