package com.raman.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        try {
            ThrowThrowsDemo td = new ThrowThrowsDemo();
            td.meth1();
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }
        System.err.println("hi");
        try {
            ThrowThrowsDemo td = new ThrowThrowsDemo();
            td.meth3();
        } catch (UncheckedExceptionDemo e) {
            System.out.println(e);
        }
    }
}
