package com.raman.concepts.multithreading.usingthreadclass;

/*
 * Another way of writing thread in same class where main is there.
 *
 * */
public class Test extends Thread {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        int i = 1;
        while (true) {
            System.out.println(i + " World from main");
            i++;
            if (i == 100)
                break;
        }
    }

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello from thread");
            i++;
            if (i == 100)
                break;
        }

    }
}
