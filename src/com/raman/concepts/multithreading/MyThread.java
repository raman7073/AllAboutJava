package com.raman.concepts.multithreading;

public class MyThread extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}
