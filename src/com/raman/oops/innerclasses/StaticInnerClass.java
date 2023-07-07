package com.raman.oops.innerclasses;

public class StaticInnerClass {
    int x = 10;
    static int y = 20;

    static class My {
        public void show() {
            System.out.println(y + "Static Inner Class");
            //we cannot access x here
        }
    }
}
