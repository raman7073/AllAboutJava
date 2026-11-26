package com.raman.leetcodedesign;

/*
 * "769 isn't a hard constraint—it's a prime number
 * picked as a trade-off between memory and bucket
 * chain length for ~10,000 operations. If the key count
 * could grow much larger in production, I'd track size
 *  and loadFactor and resize the bucket array dynamically
 * instead of hardcoding 769."
 *
 *
 * */
class MyHashSet {
    private static final int CAPACITY = 769;
    private final Node[] buckets;

    public MyHashSet() {
        this.buckets = new Node[CAPACITY];
    }

    private int hash(int val) {
        return val % buckets.length;
    }

    public void add(int key) {
        int idx = this.hash(key);
        Node curr = this.buckets[idx];
        while (curr != null) {
            if (curr.key == key) {
                return;
            }
            curr = curr.next;
        }
        buckets[idx] = new Node(key, buckets[idx]);

    }

    public void remove(int key) {
        int idx = this.hash(key);
        Node curr = this.buckets[idx];
        Node prev = null;
        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    buckets[idx] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }

    }

    public boolean contains(int key) {
        int idx = this.hash(key);
        Node curr = this.buckets[idx];
        while (curr != null) {
            if (curr.key == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;

    }

    private static class Node {
        final int key;
        Node next;

        Node(int key, Node next) {
            this.key = key;
            this.next = next;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
