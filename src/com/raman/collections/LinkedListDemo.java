package com.raman.collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> al = new LinkedList<>();
        al.add(10);
        al.add(0, 4);
        al.addAll(List.of(40, 60, 70));
        al.addAll(5, List.of(40, 60, 70));
        System.out.println(al);
        boolean ans = al.contains(9);
        System.out.println(ans);
        al.remove(4);
        al.remove(Integer.valueOf(4));
        System.out.println(al);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        for (Integer x : al) {
            System.out.println(x);
        }

        for (var x : al) {
            System.out.println(x);
        }
        for (Iterator<Integer> it = al.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
        al.forEach(x -> System.out.println(x));
        ListIterator<Integer> lt = al.listIterator();
        while (lt.hasNext()) {
            System.out.println(lt.next());
        }

        al.addFirst(3);
        al.addLast(200);
        System.out.println(al);

    }
}
