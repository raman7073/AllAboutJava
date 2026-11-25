package com.raman.lfucache;

class Node {
    int key;
    int value;
    int frequency;
    Node next;
    Node prev;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.frequency = 1;
        this.next = null;
        this.prev = null;
    }
}
