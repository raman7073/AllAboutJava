package com.raman.concepts.multithreading.usingrunnableinterface;

public class ThreadTestRunnable implements Runnable {
    public static void main(String[] args) {

        ThreadTestRunnable m = new ThreadTestRunnable();
        Thread t = new Thread(m);
        t.start();
        int i = 1;
        while (true) {
            System.out.println(i + " World from main");
            i++;
            if (i == 100)
                break;
        }
    }

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
