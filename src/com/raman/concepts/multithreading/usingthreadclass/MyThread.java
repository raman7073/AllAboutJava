package com.raman.concepts.multithreading.usingthreadclass;

public class MyThread extends Thread {
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
