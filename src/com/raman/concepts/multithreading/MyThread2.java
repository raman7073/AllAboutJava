package com.raman.concepts.multithreading;

//if this class extend some other class and we want also to implement thread then ,
// as we know a class can't
//extend more than 1 class ,in such case we can implement Runnable interface
public class MyThread2 extends SomeClass implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}
