package com.raman.oops.interfaces;

/**
 * Interface are just to achieve runtime polymorphism.
 * We can have reference of interface, but it can call methods known to it.
 * Interfaces can have static and final Members, if we write int X=10;
 * they will be by default final static.
 * By default, all methods are public and abstract,it can't have private methods.
 * interface can have static methods.
 * To update interfaces without disturbing classes implementing them , we can have default method
 * we can have private method inside interfaces with body, and definitely it is used by default method
 * Interface is more perfect than multiple interference and it is a pure oop concept.
 */
public interface Interface {
    final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
}
