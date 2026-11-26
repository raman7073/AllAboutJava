package com.raman.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o2, o1); // max-heap order
    }
}

public class HeapDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator());
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(60);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
    }
}
