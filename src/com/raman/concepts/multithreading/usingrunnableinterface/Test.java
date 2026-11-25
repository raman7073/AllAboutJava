package com.raman.concepts.multithreading.usingrunnableinterface;

public class Test {
    public static void main(String[] args) {

        My m = new My();
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
}
