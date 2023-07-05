package com.raman.oops.absclass;

/**
 *   We can have reference of abstract class but we can't have object of abstract class.
 *   Abstract method doesn't have body.A class is abstract if it has atleast one abstract ,method.
 *   A class extending abstract class becomes abstract .To become concrete class,
 *   this class must implement abstract method.
 *   Abstract class are there to impose standards and other purpose.Abstract class are meant for inheritance,
 *   and they can't be declared final. A class extending abstract class should follow all the standards.
 *   Abstract class can't be static .
 */
abstract class Abstract {
    public void math(){
        int a =10;
        System.out.println(a);
    }
}
