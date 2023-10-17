package com.raman.concepts.multithreading;

public class ThreadTest {
    public static void main(String[] args) {
        /*
        MyThread t = new MyThread();
        t.start();
        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }

         */

        MyThread2 mt = new MyThread2();
        Thread t = new Thread(mt);
        t.start();
        int i = 1;
        while (true) {                    
            System.out.println(i + " World");
            i++;
        }
    }
}
