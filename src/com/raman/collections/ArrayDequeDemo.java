package com.raman.collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(100);
        dq.offerLast(30);
        System.out.println(dq);
        dq.offerFirst(200);
        dq.offerFirst(60);
        System.out.println(dq);
        /*
        * If you just use offerLast and pollLast
        * it will act as stack and vice-versa means
        * offerFirst and pollFirst is also stack
        * If you just use offerLast and pollFirst
        * it will acts like Queue and vice-versa
        * */
    }
}
