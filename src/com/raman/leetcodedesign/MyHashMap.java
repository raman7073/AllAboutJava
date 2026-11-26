package com.raman.leetcodedesign;

class MyHashMap {

    private static final int CAPACITY = 769;
    private final Node[] buckets;
    public MyHashMap() {
        this.buckets = new Node[CAPACITY];
    }

    private int hash(int val) {
        return val % buckets.length;
    }

    public void put(int key, int value) {
        int idx = this.hash(key);
        Node curr = this.buckets[idx];
        while (curr != null) {
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }
        buckets[idx] = new Node(key, value, buckets[idx]);

    }

    public int get(int key) {
        int idx = this.hash(key);
        Node curr = this.buckets[idx];
        while (curr != null) {
            if (curr.key == key) {
                return curr.value;
            }
            curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        int idx = this.hash(key);
        Node curr = this.buckets[idx];
        Node prev = null;
        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    this.buckets[idx] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }

    }

    private static class Node {
        final int key;
        int value;
        Node next;

        Node(int key, int value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */