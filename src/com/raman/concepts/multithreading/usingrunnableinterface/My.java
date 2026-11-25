package com.raman.concepts.multithreading.usingrunnableinterface;

public class My implements Runnable {
    @Override
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

