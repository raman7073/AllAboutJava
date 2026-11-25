package com.raman.dsa.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(5);
        ll.append(10);
        ll.append(13);
        ll.append(34);
        // ll.printList();
        Node last = ll.removeLast();
        //ll.printList();
        if (last != null)
            System.out.println(last.value);


    }
}
